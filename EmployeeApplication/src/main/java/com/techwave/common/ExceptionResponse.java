package com.techwave.common;

import java.time.Instant;

public class ExceptionResponse
{
    private String errorMessage;
    private Long errCode;
    private Instant timestamp;
    private String requestedURI;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Long getErrCode() {
        return errCode;
    }

    public void setErrCode(Long errCode) {
        this.errCode = errCode;
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
}
