package eu.ensup.demospringdatajpa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import eu.ensup.demospringdatajpa.dao.IEleveDao;
import eu.ensup.demospringdatajpa.domaine.Eleve;

public class EleveTest {
	private Eleve eleve;
	private IEleveDao ielevedao;
	private ClassPathXmlApplicationContext appContext;

	@Test
	public void testCreateAndReadEleve() {
		appContext = new ClassPathXmlApplicationContext("spring-data.xml");

		ielevedao = (IEleveDao) appContext.getBean("IEleveDao"); //dois avoir la meme casse que l'interface
		eleve = new Eleve("moi", "meme");
		ielevedao.save(eleve);

		assertEquals("meme",ielevedao.findOne(1).getPrenom() );
		
		
	}


}
