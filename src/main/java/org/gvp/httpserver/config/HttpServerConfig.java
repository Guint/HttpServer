package org.gvp.httpserver.config;

import org.gvp.httpserver.HttpServerContext;
import org.gvp.httpserver.ServerInfo;

import java.net.Socket;
import java.util.concurrent.ThreadFactory;

public interface HttpServerConfig {

    ServerInfo getServerInfo();

    String getStatusMessage(int statusCode);

    HttpRequestParser getHttpRequestParser();

    HttpResponseBuilder getHttpResponseBuilder();

    HttpResponseWriter getHttpResponseWriter();

    HttpServerContext getHttpServerContext();

    HttpRequestDispatcher getHttpRequestDispatcher();

    ThreadFactory getWorkerThreadFactory();

    HttpClientSocketHandler buildNewHttpClientSocketHandler(Socket clientSocket);
}
