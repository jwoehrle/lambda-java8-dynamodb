package com.amazonaws.serverless;

import com.amazonaws.services.lambda.runtime.Context;

import java.util.Map;

public class Handler {

    public String handleRequest(Payload input, Context context) {
        context.getLogger().log("Input: " + input);
        context.getLogger().log("Name: " + input.getName());
        return "Hello World - " + input;
    }
}
