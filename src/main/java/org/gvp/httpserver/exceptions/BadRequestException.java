package org.gvp.httpserver.exceptions;

public class BadRequestException extends AbstractRequestParseFailedException {

    public BadRequestException(String message, Throwable cause, String startingLine) {
        super(message, cause, startingLine);
        setStatus(400);
    }
}
