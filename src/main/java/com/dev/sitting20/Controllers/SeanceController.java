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

import com.dev.sitting20.Entities.Seance;
import com.dev.sitting20.Services.ISeance;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "seances", headers = "Accept=application/json")
public class SeanceController {
	@Autowired
	private ISeance seanceService;
	@GetMapping(value = "/allseances")
    public @ResponseBody
    List<Seance> getAllSitters() {
        return this.seanceService.findAllSeances();
    }
	 @PutMapping(value = "/updateSeance")
	    public Seance update(@RequestBody Seance p) {
	        System.out.println("update" + p);
	        return this.seanceService.updateSeance(p);
	    }

	    @PostMapping(value = "/addSeance")
	    public void add(@RequestBody Seance p) {


	        this.seanceService.addSeance(p);

	    }

	    @DeleteMapping(value = "/deleteSeance")
	    public boolean delete(@RequestBody Seance p) {
	    	seanceService.deleteSeance(p);
	        return true;
	    }
	    @GetMapping(value = "/find/{id}")
	    public Seance findOne(@PathVariable Long id) {
	        return this.seanceService.getSeance(id);
	    }
	
}
