package com.dev.sitting20.Entities;


import java.util.HashSet;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;



@Entity
public class Parent extends Personne {

	String profession;
	int nbre_enfants;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "parent")
    Set<Enfant> enfants = new HashSet<>();

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Parent(String profession, int nbre_enfants, Set<Enfant> enfants) {
		super();
		this.profession = profession;
		this.nbre_enfants = nbre_enfants;
		this.enfants = enfants;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public int getNbre_enfants() {
		return nbre_enfants;
	}

	public void setNbre_enfants(int nbre_enfants) {
		this.nbre_enfants = nbre_enfants;
	}

	public Set<Enfant> getEnfants() {
		return enfants;
	}

	public void setEnfants(Set<Enfant> enfants) {
		this.enfants = enfants;
	}

}
