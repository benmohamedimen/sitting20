package com.dev.sitting20.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.sitting20.Entities.Parent;
import com.dev.sitting20.Entities.Personne;
import com.dev.sitting20.Services.IParent;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "parents", headers = "Accept=application/json")
public class ParentController {
	
	@Autowired 
	private IParent parentService;
	
	 @GetMapping(value = "/allparents")
	    public @ResponseBody
	    List<Parent> getAllParents() {
	        return this.parentService.findAllParents();
	    }
	 
	 @PutMapping(value = "/updateParent")
	    public Parent update(@RequestBody Parent p) {
	        System.out.println("update" + p);
	        return this.parentService.updateParent(p);
	    }

	    @PostMapping(value = "/addParent")
	    public void add(@RequestBody Parent p) {


	        this.parentService.addParent(p);

	    }

	    @DeleteMapping(value = "/deleteParent")
	    public boolean delete(@RequestBody Parent p) {
	        parentService.deleteParent(p);
	        return true;
	    }
	    @GetMapping(value = "/find/{id}")
	    public Parent findOne(@PathVariable Long id) {
	        return this.parentService.getParent(id);
	    }
}
