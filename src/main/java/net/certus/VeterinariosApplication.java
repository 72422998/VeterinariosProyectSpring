package net.certus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class VeterinariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(VeterinariosApplication.class, args);
	}

}
