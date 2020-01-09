package com.dev.sitting20.ServicesImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.dev.sitting20.Entities.Personne;
import com.dev.sitting20.Repositories.PersonneRepository;
import com.dev.sitting20.Services.IPersonne;


@Service
public class PersonneServiceImp implements IPersonne {
    @Autowired
    private PersonneRepository personneRepository;

    /*@Autowired
    private RoleRepository roleRepository;*/


    @Override
    public void addPersonne(Personne personne) {

        this.personneRepository.save(personne);

    }

    @Override
    public Personne updatePersonne(Personne personne) {

        return this.personneRepository.save(personne);
    }

    @Override
    public List<Personne> findAllPersonnes() {
        return (List<Personne>) this.personneRepository.findAll();
    }

    /*@Override
    public void changeStatus(long NIF, String status) {
        this.personneRepository.changeStatus(NIF, status);

    }*/

    @Override
    public Personne getPersonne(Long id) {
        return this.personneRepository.findOne(id);
    }

    @Override
    public boolean deletePersonne(Personne personne) {
        personneRepository.delete(personne);
        return true;
    }


  /*  @Override
    public void addRoleToUser(String login, String roleName) {
        AppRole role = roleRepository.findByName(roleName);
        Personne cmpt = personneRepository.findByUsername(login);
        // cmpt.getRoles().add(role);
    }

    @Override
    public Personne authentication(String login, String pwd) {
        return personneRepository.authentication(login, pwd);
    }

    @Override
    public Personne findByLogin(String login) {
        return personneRepository.findByLogin(login);
    }

    @Override
    public Personne findByEmailAndLogin(String login, String email) {
        return personneRepository.findByEmailAndLogin(login, email);
    }*/


}
