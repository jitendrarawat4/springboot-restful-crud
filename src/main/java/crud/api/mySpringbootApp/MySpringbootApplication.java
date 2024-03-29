package crud.api.mySpringbootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "crud.api.mySpringbootApp.controller", "crud.api.mySpringbootApp.impl", "crud.api.mySpringbootApp.firebase" })

public class MySpringbootApplication {

	public static void main(String[] args) {

		SpringApplication.run(MySpringbootApplication.class, args);
	}

}
