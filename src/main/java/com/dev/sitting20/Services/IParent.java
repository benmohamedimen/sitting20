package com.dev.sitting20.Services;

import java.util.List;

import com.dev.sitting20.Entities.Parent;



public interface IParent {
	 void addParent(Parent parent);

	    Parent updateParent(Parent parent);

	    List<Parent> findAllParents();

	    Parent getParent(Long id);

	    public boolean deleteParent(Parent parent);
}
