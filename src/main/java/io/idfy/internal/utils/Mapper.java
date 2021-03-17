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
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .disable(DeserializationFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE); // todo: Make the mapper able to turn ISO-8601 time strings into OffsetDatetime without changing auto-generated code.
            // .setDateFormat(SimpleDateFormat.getDateTimeInstance());
    /*
    SimpleModule simpleModule = new SimpleModule()
            .addDeserializer(OffsetDateTime.class, new JsonDeserializer<OffsetDateTime>() {
                @Override
                public OffsetDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
                    jsonParser.readValueAs(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                }
            });
        simpleModule.addSerializer(OffsetDateTime.class, new JsonSerializer<OffsetDateTime>() {
        @Override
        public void serialize(OffsetDateTime offsetDateTime, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
            jsonGenerator.writeString(DateTimeFormatter.ISO_LOCAL_DATE_TIME.format(offsetDateTime));
        }
    });*/
            // .setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm"))
            // .setDateFormat(new StdDateFormat());
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
