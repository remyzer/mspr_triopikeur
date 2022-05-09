package fr.rennes.epsi.poec.canapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "fr.rennes.epsi.poec.canapi")
public class CanapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CanapiApplication.class,args);
	}
}
