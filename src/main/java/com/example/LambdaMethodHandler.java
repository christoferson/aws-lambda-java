package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.stream.Collectors;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestStreamHandler;

public class LambdaMethodHandler implements RequestStreamHandler {
	public void handleRequest(InputStream inputStream, OutputStream outputStream, Context context) throws IOException {
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
			PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream, Charset.forName("UTF-8"))))) {
			String input = reader.lines().collect(Collectors.joining());
			System.out.println(input);
			writer.append("Hello World - " + input);
			writer.flush();
		}
	}
}
