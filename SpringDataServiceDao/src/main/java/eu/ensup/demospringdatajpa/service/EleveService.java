package eu.ensup.demospringdatajpa.service;

import eu.ensup.demospringdatajpa.dao.IEleveDao;
import eu.ensup.demospringdatajpa.domaine.Eleve;

public class EleveService {

	private IEleveDao ielevedao;

	public IEleveDao getIelevedao() {
		return ielevedao;
	}

	public void setIelevedao(IEleveDao ielevedao) {
		this.ielevedao = ielevedao;
	}

	public Eleve creerEleve(Eleve pEleve) {
		return ielevedao.save(pEleve);
	}

	public Eleve lireEleveParId(int idEleve) {
		return ielevedao.findOne(idEleve);
	}
}
