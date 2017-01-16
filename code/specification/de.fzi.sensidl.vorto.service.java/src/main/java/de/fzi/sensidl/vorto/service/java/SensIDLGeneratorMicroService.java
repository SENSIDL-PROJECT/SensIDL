package de.fzi.sensidl.vorto.service.java;

import org.eclipse.vorto.codegen.api.IVortoCodeGenerator;
import org.eclipse.vorto.service.generator.web.AbstractBackendCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import de.fzi.sensidl.vorto.service.java.generator.*;

/**
 * 
 * @author Fabian Scheytt
 *
 */
@SpringBootApplication
public class SensIDLGeneratorMicroService extends AbstractBackendCodeGenerator {

	@Bean
	public IVortoCodeGenerator awsGenerator() {
		return new SensIDLGenerator();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SensIDLGeneratorMicroService.class, args);
	}
}