package pe.idat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EfMarcoRevillaHospedajeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfMarcoRevillaHospedajeApplication.class, args);
	}

}
