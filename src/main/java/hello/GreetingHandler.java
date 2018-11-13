package hello;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

@Component
public class GreetingHandler {
	public static final String bods = "Justin's Local To Do List: \n\n 1. Email Vicky Howell \n 2. Catch up on lecture? \n 3. EE overview";
	String fileN = "/Users/JustinRWong/Desktop/PersonalWebsite-2/ReactiveRESTfulWeb/src/main/java/hello/test.txt";

	public Mono<ServerResponse> hello(ServerRequest request) {
		String content = reader(fileN);
		return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
			.body(BodyInserters.fromObject(content));

	}
	
	String reader(String fileName) {
		String cont = "a";
		try { 
			cont = new String(Files.readAllBytes(Paths.get(fileName)));
			return cont;
		} catch (Exception e) {
			System.out.println("ERRORED");
			return cont;
		}
	}
}
