package com.dev.sitting20.Services;

import java.util.List;

import com.dev.sitting20.Entities.Enfant;


public interface IEnfant {
	 void addEnfant(Enfant enfant);

	    Enfant updateEnfant(Enfant enfant);

	    List<Enfant> findAllEnfants();

	    Enfant getEnfant(Long id);

	    public boolean deleteEnfant(Enfant enfant);

}
