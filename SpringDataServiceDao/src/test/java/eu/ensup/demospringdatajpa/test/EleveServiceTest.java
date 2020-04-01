package eu.ensup.demospringdatajpa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.demospringdatajpa.domaine.Eleve;
import eu.ensup.demospringdatajpa.service.EleveService;

public class EleveServiceTest {
		private Eleve eleve;
		private EleveService eleveService;
		private ClassPathXmlApplicationContext appContext;
		
	@Test
	public void test() {

		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		eleveService = (EleveService) appContext.getBean("eleveservice"); // dois avoir la meme casse que l'interface
		eleve = new Eleve("moidao", "memedao");
		eleveService.creerEleve(eleve);

		assertEquals("memedao", eleveService.lireEleveParId(3).getPrenom());

	}

}
