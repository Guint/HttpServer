package org.gvp.httpserver.config;

import java.io.IOException;
import java.io.OutputStream;

public interface HttpResponseWriter {

    void writeHttpResponse(OutputStream out, ReadableHttpResponse response) throws IOException;
}
