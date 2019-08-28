package io.idfy.internal.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import io.idfy.models.IdfyResponse;

import java.io.IOException;

public final class Mapper {
    private static final ObjectMapper mapper = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    public static <T> T fromJson(String json, Class<T> classOf) throws IOException {
        return mapper.readValue(json, classOf);
    }

    public static <T> T fromJson(IdfyResponse response, Class<T> classOf) throws IOException {
        return mapper.readValue(response.getResponseJson(), classOf);
    }

    public static String toJson(Object src) throws JsonProcessingException {
        return mapper.writeValueAsString(src);
    }
}
