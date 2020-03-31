package eu.ensup.deuxiemeprojetspring.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import eu.ensup.deuxiemeprojetspring.dao.EleveDao;
import eu.ensup.deuxiemeprojetspring.service.EleveService;

@Configuration
public class ConfigurationBeans {

	@Bean
	public EleveService eservice() {
		return new EleveService(edao());	//injection
	}
	
	@Bean
	public EleveDao edao() {
		return new EleveDao();
	}
	
}
