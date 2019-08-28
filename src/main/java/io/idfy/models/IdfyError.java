package io.idfy.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class IdfyError implements Serializable
{
    private static final long serialVersionUID = -7882843883754510081L;
    private String message;
    private String code;

    // OAuth 2 errors
    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

    public IdfyError() {

    }


    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    public void setErrorDescription(String errorDescription) {
        this.errorDescription = errorDescription;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
