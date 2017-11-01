package org.gvp.httpserver.impl;

import org.gvp.httpserver.config.HttpResponseWriter;
import org.gvp.httpserver.config.ReadableHttpResponse;

import java.io.IOException;
import java.io.OutputStream;

class DefaultHttpResponseWriter implements HttpResponseWriter{
    @Override
    public void writeHttpResponse(OutputStream out, ReadableHttpResponse response) throws IOException {

    }
}
