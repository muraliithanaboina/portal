package employeportal.portal;

import employeportal.portal.Exception.Applicationerror;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication

public class PortalApplication {
	@Bean
	public Applicationerror createbean(){
		return new Applicationerror();
	}


	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);

	}

}
