package mx.com.santander.autocompara.catalogos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class AutocomparaCatalogosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutocomparaCatalogosApplication.class, args);
	}
}
