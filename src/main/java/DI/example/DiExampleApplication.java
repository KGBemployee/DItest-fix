package DI.example;

import Controller.ConstructorController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class DiExampleApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiExampleApplication.class, args);

		ConstructorController constructorController = (ConstructorController)ctx.getBean("ConstructorController");

		constructorController.greeting();


	}

	}

