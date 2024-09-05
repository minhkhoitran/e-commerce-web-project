package personal.project.e_commerce;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class ECommerceApplication {

	public static void main(String[] args) {
		log.info("Run success");
		SpringApplication.run(ECommerceApplication.class, args);
	}

}
