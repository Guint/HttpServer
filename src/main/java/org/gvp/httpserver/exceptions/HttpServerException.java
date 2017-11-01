package org.gvp.httpserver.exceptions;

public class HttpServerException extends RuntimeException {
    private int status = 500;

    public HttpServerException(String message) {
        super(message);
    }

    public HttpServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public HttpServerException(Throwable cause) {
        super(cause);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
