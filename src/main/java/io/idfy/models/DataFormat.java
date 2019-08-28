package io.idfy.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum DataFormat {
    @JsonProperty("xml")
    Xml,

    @JsonProperty("pdf")
    Pdf,

    @JsonProperty("txt")
    Txt,
}
