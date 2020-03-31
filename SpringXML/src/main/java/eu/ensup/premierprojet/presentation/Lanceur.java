package eu.ensup.premierprojet.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.premierprojet.service.EleveService;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// -a: chargement conteneur
		ApplicationContext appcontext = (ApplicationContext) new ClassPathXmlApplicationContext("demospringinjection.xml");
		// -b: récupération du bean service
		EleveService eService = (EleveService) appcontext.getBean("eleveservice");
		// -c: manipulation du bean service (ex: lecture d'un élève dont l'id est 1)
		System.out.println(eService.lireEleve(1).toString());
	}

}
