package com.example;

import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class LambdaMethodHandler {
    public String handleRequest(Map<String, Object> input, Context context) {
    	LambdaLogger logger = context.getLogger();
    	logger.log("Input: " + input);
        return "Hello World - " + input;
    }
}
