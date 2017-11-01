package org.gvp.httpserver.exceptions;

public class HttpServerConfigException extends HttpServerException {

    public HttpServerConfigException(String message) {
        super(message);
    }

    public HttpServerConfigException(Throwable cause) {
        super(cause);
    }

    public HttpServerConfigException(String message, Throwable cause) {
        super(message, cause);
    }
}
