package eu.ensup.deuxiemeprojetspring.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import eu.ensup.deuxiemeprojetspring.configuration.ConfigurationBeans;
import eu.ensup.deuxiemeprojetspring.service.EleveService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// -a: chargement conteneur
		ApplicationContext appcontext = (ApplicationContext) new AnnotationConfigApplicationContext(ConfigurationBeans.class);
		// -b: récupération du bean service
		EleveService eService = (EleveService) appcontext.getBean("eservice");
		// -c: manipulation du bean service (ex: lecture d'un élève dont l'id est 1)
		System.out.println(eService.lireEleve(1).toString());

	}

}
