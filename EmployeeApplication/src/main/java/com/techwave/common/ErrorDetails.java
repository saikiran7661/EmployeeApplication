package com.techwave.common;



import java.time.Instant;

/**
 * errordetails extends runtimeexception
 */
public class ErrorDetails extends RuntimeException
{

    private Long errCode;
    private String errMessage;
    private Instant timestamp;
    private String requestedURI;

    /**
     * @return long
     */
    public Long getErrCode() {
        return errCode;
    }

    /**
     * @param errCode  long type
     *
     */
    public void setErrCode(Long errCode) {
        this.errCode = errCode;
    }

    /**
     * @return string type
     */
    public String getErrMessage() {
        return errMessage;
    }

    /**
     * @param errMessage string type
     */
    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    /**
     * @return Instant(time and date)
     */
    public Instant getTimestamp() {
        return timestamp;
    }

    /**
     * @param timestamp (time and date)
     */
    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * @return string type
     */
    public String getRequestedURI() {
        return requestedURI;
    }

    /**
     * @param requestedURI string
     */
    public void setRequestedURI(String requestedURI) {
        this.requestedURI = requestedURI;
    }

    /**
     * Default constructor
     */
    public ErrorDetails() {
        super();
    }

    /**
     * @param message
     * @param errCode
     */
    public ErrorDetails(final String message,Long errCode) {
        super(message);
        this.errCode=errCode;
        this.errMessage=message;

    }

}
