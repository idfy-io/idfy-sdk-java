package io.idfy.models;

import java.io.Serializable;
import java.util.Date;

public final class IdfyResponse implements Serializable
{
    private static final long serialVersionUID = -2570594194518948666L;
    /**
     * The raw JSON returned by Idfy.
     */
    private String responseJson;

    /**
     * A unique identifier associated with the request. You will be able to use this to search the logs in the Idfy dashboard.
     * If you need to contact us about a specific request, providing the request identifier will ensure the fastest possible resolution.
     */
    private String requestId;

    /**
     * The date and time at which the request was made.
     */
    private Date requestDate;

    public IdfyResponse() {

    }

    public IdfyResponse(String responseJson, String requestId, Date requestDate){
        this.responseJson = responseJson;
        this.requestId = requestId;
        this.requestDate = requestDate;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getResponseJson() {
        return responseJson;
    }

    public void setResponseJson(String responseJson) {
        this.responseJson = responseJson;
    }
}