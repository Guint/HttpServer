package org.gvp.httpserver.impl;

import org.gvp.httpserver.config.HttpResponseBuilder;
import org.gvp.httpserver.config.ReadableHttpResponse;

class DefaultHttpResponseBuilder implements HttpResponseBuilder {

    @Override
    public ReadableHttpResponse buildNewHttpResponse() {
        // TODO Auto-generated method stub
        return new DefaultReadableHttpResponse();
    }

    @Override
    public void prepareHttpResponse(ReadableHttpResponse response, boolean clearBody) {
        // TODO Auto-generated method stub

    }

}
