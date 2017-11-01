package org.gvp.httpserver.exceptions;

import java.util.Arrays;

public class MethodNotAllowedException extends AbstractRequestParseFailedException {

    public MethodNotAllowedException(String method, String startingLine) {
        super(String.format("Only %s  are supported. Current method is %s", Arrays.toString(Methods.values()), method), startingLine);
        setStatus(405);
    }
}
