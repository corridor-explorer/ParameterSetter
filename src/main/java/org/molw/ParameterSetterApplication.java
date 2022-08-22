package org.molw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = "org.molw")
public class ParameterSetterApplication {
	private static ApplicationContext applicationContext;
	public static void main(String[] args) {

		applicationContext = SpringApplication.run(ParameterSetterApplication.class, args);
		System.out.println(System.getProperty("java.class.path"));
	}

}
