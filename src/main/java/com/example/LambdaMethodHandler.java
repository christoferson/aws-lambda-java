package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class LambdaMethodHandler {
    public String handleRequest(com.example.entity.Character input, Context context) {
    	LambdaLogger logger = context.getLogger();
    	logger.log("Input: " + input);
        return "Hello World - " + input;
    }
}
