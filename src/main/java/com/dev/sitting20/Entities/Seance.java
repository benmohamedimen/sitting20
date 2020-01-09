package com.dev.sitting20.Entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Seance implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO) long id;
	
	int nbre_enfants_Seance;
	Double duree;
	@ManyToOne
	@JoinColumn(name = "sitter_id")
	Sitter sitter;
	@ManyToMany
    Set<Enfant> listEnfants;
	public Seance() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Seance(long id, int nbre_enfants_Seance, Double duree, Sitter sitter) {
		super();
		this.id = id;
		this.nbre_enfants_Seance = nbre_enfants_Seance;
		this.duree = duree;
		this.sitter = sitter;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNbre_enfants_Seance() {
		return nbre_enfants_Seance;
	}
	public void setNbre_enfants_Seance(int nbre_enfants_Seance) {
		this.nbre_enfants_Seance = nbre_enfants_Seance;
	}
	public Double getDuree() {
		return duree;
	}
	public void setDuree(Double duree) {
		this.duree = duree;
	}
	public Sitter getSitter() {
		return sitter;
	}
	public void setSitter(Sitter sitter) {
		this.sitter = sitter;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
