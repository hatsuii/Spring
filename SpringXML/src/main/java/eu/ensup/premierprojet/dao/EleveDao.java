package eu.ensup.premierprojet.dao;

import java.util.List;

import eu.ensup.premierprojet.domaine.Eleve;

public class EleveDao {

	public EleveDao() {
		// TODO Auto-generated constructor stub
	}
	public void create(Eleve pEleve) {
		System.out.println("creation eleve: ");
	}
	public Eleve getEleveById(int idEleve){
		System.out.println("recupereation Eleve dont l'id est:"+ idEleve);
		return new Eleve("jean", "pierre");
	}
	public void delete(Eleve pEleve) {
		System.out.println("suppression élève");
	}
	public List<Eleve> getAll() {
		System.out.println("recuperation tous les élèves");
		return null;
	}
}
