package eu.ensup.premierprojet.service;

import java.util.List;

import eu.ensup.premierprojet.dao.EleveDao;
import eu.ensup.premierprojet.domaine.Eleve;

public class EleveService {
	// injection de la propriété dao dans le service
	// besoin de setter et getter
	private EleveDao elevedao;

	public EleveDao getElevedao() {
		return elevedao;
	}

	public void setElevedao(EleveDao elevedao) {
		this.elevedao = elevedao;
	}

	public void creerEleve() {
		elevedao.create(new Eleve("jean", "jac"));
	}

	public Eleve lireEleve(int id) {
		return elevedao.getEleveById(id);
	}

	public void delete(Eleve pEleve) {
		elevedao.delete(pEleve);
	}

	public List<Eleve> lireTousEleve() {
		return elevedao.getAll();
	}
}
