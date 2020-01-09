package com.dev.sitting20.Controllers;

import java.security.Principal;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.dev.sitting20.Entities.Personne;
import com.dev.sitting20.Services.IPersonne;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(value = "personnes", headers = "Accept=application/json")
public class PersonneController {
	
	
	

    @Autowired
    private IPersonne personneService;

    @GetMapping(value = "/allpersonnes")
    public @ResponseBody
    List<Personne> getAllPersonnes() {
        return this.personneService.findAllPersonnes();
    }

    /*@PutMapping(value = "/updatePersonne/{id}")
    public List<Personne> changeStatus(@PathVariable long NIF, @PathVariable String Status) {
        this.personneService.changeStatus(NIF, Status);
        return this.personneService.findAll();
    }*/
    /*@RequestMapping("/user")
    public Principal user(Principal user) {
        return user;
    }*/
   /* @PostMapping(value ="/login")
    public boolean login(@RequestBody Personne user) {
        return
                user.getUsername().equals("admin") && user.getPassword().equals("admin");
    }*/

    @PutMapping(value = "/updatePersonne")
    public Personne update(@RequestBody Personne p) {
        System.out.println("update" + p);
        return this.personneService.updatePersonne(p);
    }

    @PostMapping(value = "/addPersonne")
    public void add(@RequestBody Personne p) {


        this.personneService.addPersonne(p);

    }

    @DeleteMapping(value = "/deletePersonne")
    public boolean delete(@RequestBody Personne p) {
        personneService.deletePersonne(p);
        return true;
    }
  /*  @GetMapping(value = "/findByLogin/{login}")
    public @ResponseBody
    Personne getAllContribuables(@PathVariable String login) {
        return this.personneService.findByLogin(login);
    }*/



    @GetMapping(value = "/find/{id}")
    public Personne findOne(@PathVariable Long id) {
        return this.personneService.getPersonne(id);
    }
}
