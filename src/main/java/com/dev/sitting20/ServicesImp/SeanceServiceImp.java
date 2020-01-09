package com.dev.sitting20.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dev.sitting20.Entities.Seance;
import com.dev.sitting20.Repositories.SeanceRepository;
import com.dev.sitting20.Services.ISeance;

@Service 
public class SeanceServiceImp implements ISeance {
@Autowired
private SeanceRepository seanceRepository;

	@Override
	public void addSeance(Seance seance) {
		this.seanceRepository.save(seance);
		
	}

	@Override
	public Seance updateSeance(Seance seance) {
		   return this.seanceRepository.save(seance);
	}

	@Override
	public List<Seance> findAllSeances() {
		 return (List<Seance>) this.seanceRepository.findAll();
	}

	@Override
	public Seance getSeance(Long id) {
		return this.seanceRepository.findOne(id);
	}

	@Override
	public boolean deleteSeance(Seance seance) {
		seanceRepository.delete(seance);
	        return true;
	}

}
