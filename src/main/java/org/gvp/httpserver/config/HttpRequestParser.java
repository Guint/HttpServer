package org.gvp.httpserver.config;

import org.gvp.httpserver.HttpRequest;
import org.gvp.httpserver.exceptions.HttpServerException;

import java.io.IOException;
import java.io.InputStream;

public interface HttpRequestParser {

    HttpRequest parseHttpRequest(InputStream inputStream, String remoteAddress) throws IOException, HttpServerException;
}
