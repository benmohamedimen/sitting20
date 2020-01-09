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

import com.dev.sitting20.Entities.Personne;
import com.dev.sitting20.Entities.Sitter;
import com.dev.sitting20.Services.IPersonne;
import com.dev.sitting20.Services.ISitter;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "sitters", headers = "Accept=application/json")
public class SitterController {

	@Autowired
	private ISitter sitterService;
	@GetMapping(value = "/allsitters")
    public @ResponseBody
    List<Sitter> getAllSitters() {
        return this.sitterService.findAllSitters();
    }
	 @PutMapping(value = "/updateSitter")
	    public Sitter update(@RequestBody Sitter p) {
	        System.out.println("update" + p);
	        return this.sitterService.updateSitter(p);
	    }

	    @PostMapping(value = "/addSitter")
	    public void add(@RequestBody Sitter p) {


	        this.sitterService.addSitter(p);

	    }

	    @DeleteMapping(value = "/deleteSitter")
	    public boolean delete(@RequestBody Sitter p) {
	    	sitterService.deleteSitter(p);
	        return true;
	    }
	    @GetMapping(value = "/find/{id}")
	    public Sitter findOne(@PathVariable Long id) {
	        return this.sitterService.getSitter(id);
	    }
	
}
