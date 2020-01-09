package com.dev.sitting20.Services;

import java.util.List;

import com.dev.sitting20.Entities.Sitter;



public interface ISitter {
	 void addSitter(Sitter sitter);

	    Sitter updateSitter(Sitter sitter);

	    List<Sitter> findAllSitters();

	    Sitter getSitter(Long id);

	    public boolean deleteSitter(Sitter sitter);

}
