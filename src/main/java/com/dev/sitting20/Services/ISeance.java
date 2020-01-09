package com.dev.sitting20.Services;

import java.util.List;

import com.dev.sitting20.Entities.Seance;



public interface ISeance {
	 void addSeance(Seance seance);

	    Seance updateSeance(Seance seance);

	    List<Seance> findAllSeances();

	    Seance getSeance(Long id);

	    public boolean deleteSeance(Seance seance);

}
