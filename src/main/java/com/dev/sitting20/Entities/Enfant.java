package com.dev.sitting20.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;





@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Enfant implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy=GenerationType.AUTO) long id;
	
	String Nom_enfant;
	String Prenom_enfant;
	Date date_Naiss;
	String sexe;
	
	@ManyToOne
	@JoinColumn(name = "parent_id")
    Parent parent;
    @ManyToMany
    Set<Seance> listSeances;
	public Enfant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Enfant(long id, String nom_enfant, String prenom_enfant, Date date_Naiss, String sexe, Parent parent) {
		super();
		this.id = id;
		Nom_enfant = nom_enfant;
		Prenom_enfant = prenom_enfant;
		this.date_Naiss = date_Naiss;
		this.sexe = sexe;
		this.parent = parent;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNom_enfant() {
		return Nom_enfant;
	}

	public void setNom_enfant(String nom_enfant) {
		Nom_enfant = nom_enfant;
	}

	public String getPrenom_enfant() {
		return Prenom_enfant;
	}

	public void setPrenom_enfant(String prenom_enfant) {
		Prenom_enfant = prenom_enfant;
	}

	public Date getDate_Naiss() {
		return date_Naiss;
	}

	public void setDate_Naiss(Date date_Naiss) {
		this.date_Naiss = date_Naiss;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
