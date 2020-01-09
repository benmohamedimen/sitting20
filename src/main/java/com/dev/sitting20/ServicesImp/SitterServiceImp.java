package com.dev.sitting20.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.dev.sitting20.Entities.Sitter;
import com.dev.sitting20.Repositories.SitterRepository;
import com.dev.sitting20.Services.ISitter;

@Service 
public class SitterServiceImp implements ISitter {
@Autowired 
private SitterRepository sitterRepository;

	@Override
	public void addSitter(Sitter sitter) {
		this.sitterRepository.save(sitter);
		
	}

	@Override
	public Sitter updateSitter(Sitter sitter) {
		 return this.sitterRepository.save(sitter);
	}

	@Override
	public List<Sitter> findAllSitters() {
		return (List<Sitter>) this.sitterRepository.findAll();
	}

	@Override
	public Sitter getSitter(Long id) {
		  return this.sitterRepository.findOne(id);
	}

	@Override
	public boolean deleteSitter(Sitter sitter) {
		sitterRepository.delete(sitter);
	        return true;
	}

}
