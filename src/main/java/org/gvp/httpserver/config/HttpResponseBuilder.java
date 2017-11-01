package org.gvp.httpserver.config;

public interface HttpResponseBuilder {

    ReadableHttpResponse buildNewHttpResponse();

    void prepareHttpResponse(ReadableHttpResponse response, boolean clearBody);

}
