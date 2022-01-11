package com.techwave.controllers;


import com.techwave.common.ErrorDetails;
import com.techwave.common.ExceptionResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import java.time.Instant;


@ControllerAdvice
public class ExceptionController
{
    @ExceptionHandler(ErrorDetails.class)
    public  @ResponseBody ExceptionResponse errorDetailsHandler(ErrorDetails Exception, final HttpServletRequest request)
    {
        ExceptionResponse error = new ExceptionResponse();
        error.setErrorMessage(Exception.getMessage());
        error.setErrCode(Exception.getErrCode());
        error.setRequestedURI(request.getRequestURI());
        error.setTimestamp(Instant.now());
        return error;
    }

    @ExceptionHandler(Exception.class)
    public @ResponseBody ExceptionResponse handleException(final Exception exception,
                                                           final HttpServletRequest request)
    {

        ExceptionResponse error = new ExceptionResponse();
        error.setErrorMessage(exception.getMessage());
        error.setRequestedURI(request.getRequestURI());
        error.setTimestamp(Instant.now());
        return error;
    }

}
