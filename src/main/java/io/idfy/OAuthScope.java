package io.idfy;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum OAuthScope
{
    @JsonProperty("account_read")
    AccountRead,
    @JsonProperty("account_write")
    AccountWrite,
    @JsonProperty("document_read")
    DocumentRead,
    @JsonProperty("document_write")
    DocumentWrite,
    @JsonProperty("document_file")
    DocumentFile,
    @JsonProperty("event")
    Event,
    @JsonProperty("identify")
    Identify,
    @JsonProperty("validation")
    Validation,
    @JsonProperty("validation_ssn")
    ValidationSsn,
    @JsonProperty("deposit_read")
    DepositRead,
    @JsonProperty("deposit_write")
    DepositWrite
}