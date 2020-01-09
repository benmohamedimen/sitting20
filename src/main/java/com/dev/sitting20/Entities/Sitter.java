package com.dev.sitting20.Entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
public class Sitter extends Personne {

	String OnService;
	Date Horaire;
	Double Prix_Heure;
	
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "sitter")
    Set<Seance> seances = new HashSet<>();


	public Sitter() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Sitter(String onService, Date horaire, Double prix_Heure, Set<Seance> seances) {
		super();
		OnService = onService;
		Horaire = horaire;
		Prix_Heure = prix_Heure;
		this.seances = seances;
	}


	public String getOnService() {
		return OnService;
	}


	public void setOnService(String onService) {
		OnService = onService;
	}


	public Date getHoraire() {
		return Horaire;
	}


	public void setHoraire(Date horaire) {
		Horaire = horaire;
	}


	public Double getPrix_Heure() {
		return Prix_Heure;
	}


	public void setPrix_Heure(Double prix_Heure) {
		Prix_Heure = prix_Heure;
	}


	public Set<Seance> getSeances() {
		return seances;
	}


	public void setSeances(Set<Seance> seances) {
		this.seances = seances;
	}
	
	
}
