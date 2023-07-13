package autoscaling.demo.autoscaling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class AutoscalingApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoscalingApplication.class, args);
	}

}
