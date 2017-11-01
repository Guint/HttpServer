package org.gvp.httpserver.impl;

import org.gvp.httpserver.config.ReadableHttpResponse;

import java.io.InputStream;
import java.io.Reader;
import java.util.Map;

class DefaultReadableHttpResponse implements ReadableHttpResponse {
    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public Map<String, String> getHeaders() {
        return null;
    }

    @Override
    public byte[] getBody() {
        return new byte[0];
    }

    @Override
    public boolean isBodyEmpty() {
        return false;
    }

    @Override
    public int getBodyLength() {
        return 0;
    }

    @Override
    public void setStatus(int status) {

    }

    @Override
    public void setHeader(String name, Object value) {

    }

    @Override
    public void setBody(String content) {

    }

    @Override
    public void setBody(InputStream in) {

    }

    @Override
    public void setBody(Reader reader) {

    }
}
