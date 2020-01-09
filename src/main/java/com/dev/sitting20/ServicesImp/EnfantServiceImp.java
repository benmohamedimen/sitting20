package com.dev.sitting20.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.sitting20.Entities.Enfant;
import com.dev.sitting20.Entities.Personne;
import com.dev.sitting20.Repositories.EnfantRepository;
import com.dev.sitting20.Services.IEnfant;

@Service 
public class EnfantServiceImp implements IEnfant {
@Autowired 
private EnfantRepository enfantRepository; 
	@Override
	public void addEnfant(Enfant enfant) {
		  this.enfantRepository.save(enfant);
		
	}

	@Override
	public Enfant updateEnfant(Enfant enfant) {
		return this.enfantRepository.save(enfant);
	}

	@Override
	public List<Enfant> findAllEnfants() {
		return (List<Enfant>) this.enfantRepository.findAll();
	}

	@Override
	public Enfant getEnfant(Long id) {
		return this.enfantRepository.findOne(id);
	}

	@Override
	public boolean deleteEnfant(Enfant enfant) {
		  enfantRepository.delete(enfant);
	        return true;
	}

}
