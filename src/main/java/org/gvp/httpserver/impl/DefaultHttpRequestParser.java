package org.gvp.httpserver.impl;

import org.gvp.httpserver.HttpRequest;
import org.gvp.httpserver.config.HttpRequestParser;
import org.gvp.httpserver.exceptions.HttpServerException;

import java.io.IOException;
import java.io.InputStream;

class DefaultHttpRequestParser implements HttpRequestParser {
    @Override
    public HttpRequest parseHttpRequest(InputStream inputStream, String remoteAddress) throws IOException, HttpServerException {
        return null;
    }
}
