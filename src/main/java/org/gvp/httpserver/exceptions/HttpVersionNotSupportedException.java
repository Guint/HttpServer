package org.gvp.httpserver.exceptions;

public class HttpVersionNotSupportedException extends AbstractRequestParseFailedException {

    public HttpVersionNotSupportedException(String message, String startingLine) {
        super(message, startingLine);
        setStatus(505);
    }
}
