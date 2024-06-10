package Junitproject.Junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		MathUtils mathUtils = new MathUtils();
		System.out.print(mathUtils.add(2,3));

	}



}
