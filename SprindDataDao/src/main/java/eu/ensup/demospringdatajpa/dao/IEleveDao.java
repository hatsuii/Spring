package eu.ensup.demospringdatajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import eu.ensup.demospringdatajpa.domaine.Eleve;

public interface IEleveDao extends JpaRepository<Eleve, Integer> {


}