package org.gvp.httpserver.exceptions;

public class AbstractRequestParseFailedException extends HttpServerException {
    private final String startingLine;

    public AbstractRequestParseFailedException(String message, String startingLine) {
        super(message);
        this.startingLine = startingLine;
    }

    public AbstractRequestParseFailedException(Throwable cause, String startingLine) {
        super(cause);
        this.startingLine = startingLine;
    }

    public AbstractRequestParseFailedException(String message, Throwable cause, String startingLine) {
        super(message, cause);
        this.startingLine = startingLine;
    }

    public String getStartingLine() {
        return startingLine;
    }
}
