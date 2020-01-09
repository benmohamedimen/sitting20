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

import com.dev.sitting20.Entities.Enfant;

import com.dev.sitting20.Services.IEnfant;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "enfants", headers = "Accept=application/json")
public class EnfantController {
	
	@Autowired 
	private IEnfant enfantService;
	@GetMapping(value = "/allenfants")
    public @ResponseBody
    List<Enfant> getAllEnfants() {
        return this.enfantService.findAllEnfants();
    }
	@PutMapping(value = "/updateEnfant")
    public Enfant update(@RequestBody Enfant p) {
        System.out.println("update" + p);
        return this.enfantService.updateEnfant(p);
    }

    @PostMapping(value = "/addEnfant")
    public void add(@RequestBody Enfant p) {


        this.enfantService.addEnfant(p);

    }

    @DeleteMapping(value = "/deleteEnfant")
    public boolean delete(@RequestBody Enfant p) {
       enfantService.deleteEnfant(p);
        return true;
    }
    @GetMapping(value = "/find/{id}")
    public Enfant findOne(@PathVariable Long id) {
        return this.enfantService.getEnfant(id);
    }
}
