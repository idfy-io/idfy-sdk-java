package io.idfy.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DataEncodingFormat {
    @JsonProperty("UTF8")
    Utf8,

    @JsonProperty("ISOLATIN")
    IsoLatin
}