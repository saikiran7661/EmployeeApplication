package com.techwave.common;



import java.time.Instant;

public class ErrorDetails extends RuntimeException
{

    private Long errCode;
    private String errMessage;
    private Instant timestamp;
    private String requestedURI;

    public Long getErrCode() {
        return errCode;
    }

    public void setErrCode(Long errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public String getRequestedURI() {
        return requestedURI;
    }

    public void setRequestedURI(String requestedURI) {
        this.requestedURI = requestedURI;
    }

    public ErrorDetails() {
        super();
    }

    public ErrorDetails(final String message,Long errCode) {
        super(message);
        this.errCode=errCode;
        this.errMessage=message;

    }

}
