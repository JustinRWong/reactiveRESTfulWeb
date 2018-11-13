package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println("\n\n====================\nYou have successfully compiled everything correctly and got your own Spring Boot server running! \n\nGo ahead modify TaskList.txt and take a look at localhost:8080/Tasks\n====================\n");
	}
}
