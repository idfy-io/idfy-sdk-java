package io.idfy.models;

public final class IdfyException extends Throwable {
    private static final long serialVersionUID = -6815648194997548216L;
    private int statusCode;
    private IdfyResponse idfyResponse;
    private IdfyError idfyError;
    private String message;
    private String error;

    public IdfyException(int statusCode, IdfyError idfyError, IdfyResponse idfyResponse, String message, String error){
        this.statusCode = statusCode;
        this.idfyError = idfyError;
        this.idfyResponse = idfyResponse;
        this.message = message;
        this.error = error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public IdfyResponse getIdfyResponse() {
        return idfyResponse;
    }

    public void setIdfyResponse(IdfyResponse idfyResponse) {
        this.idfyResponse = idfyResponse;
    }

    public IdfyError getIdfyError() {
        return idfyError;
    }

    public String getMessage() {
        return message;
    }

    public String getError() {
        return error;
    }
}
