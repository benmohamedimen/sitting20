package com.dev.sitting20.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.sitting20.Entities.Parent;
import com.dev.sitting20.Entities.Personne;
import com.dev.sitting20.Repositories.ParentRepository;
import com.dev.sitting20.Services.IParent;

@Service
public class ParentServiceImp implements IParent {

	 @Autowired
	    private ParentRepository parentRepository;

	@Override
	public void addParent(Parent parent) {
		this.parentRepository.save(parent);
		
	}

	@Override
	public Parent updateParent(Parent parent) {
		return this.parentRepository.save(parent);
	}

	@Override
	public List<Parent> findAllParents() {
		return (List<Parent>) this.parentRepository.findAll();
	}

	@Override
	public Parent getParent(Long id) {
		return this.parentRepository.findOne(id);
	}

	@Override
	public boolean deleteParent(Parent parent) {
		parentRepository.delete(parent);
        return true;
	}

}
