package com.dev.sitting20.Services;

import java.util.List;

import com.dev.sitting20.Entities.Personne;



public interface IPersonne {
    void addPersonne(Personne personne);

    Personne updatePersonne(Personne personne);

    List<Personne> findAllPersonnes();

    Personne getPersonne(Long id);

    public boolean deletePersonne(Personne personne);

   // void changeStatus(long NIF, String status);

   // void addRoleToUser(String login, String role);

  //  public Personne authentication(String login, String pwd);

 //   public Personne findByLogin(String login);

    // public Personne findByEmailAndLogin(String login, String email);
}
