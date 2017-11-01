package org.gvp.httpserver.config;

import org.gvp.httpserver.HttpResponse;

import java.util.Map;

public interface ReadableHttpResponse extends HttpResponse {

    int getStatus();

    Map<String, String> getHeaders();

    byte[] getBody();

    boolean isBodyEmpty();

    int getBodyLength();
}
