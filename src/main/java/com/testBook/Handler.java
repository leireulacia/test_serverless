package com.testBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.testBook.model.Book;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Handler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {

	private static final Logger LOG = LogManager.getLogger(Handler.class);

	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
		LOG.info("received: {}", input);

		Book b1= new Book(1, "The Famous five", 1942);
		Book b2= new Book(2, "The Growth Mindset", 2006);
		Book b3= new Book(3,"Dracula",1897);

		List<Book> books=new ArrayList();
		books.add(b1);
		books.add(b2);
		books.add(b3);


		Response responseBody = new Response("Go Serverless v1.x! Your function executed successfully!", input);
		return ApiGatewayResponse.builder()
				.setStatusCode(200)
				.setObjectBody(books)
				.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & serverless"))
				.build();
	}
}
