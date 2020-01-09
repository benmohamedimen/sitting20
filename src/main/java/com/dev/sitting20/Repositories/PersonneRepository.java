package com.dev.sitting20.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dev.sitting20.Entities.Personne;

@Repository
	public interface PersonneRepository extends JpaRepository<Personne, Long> {
	    @Query("select p from Personne p where p.nom like :x")
	    public Page<Personne> chercher(@Param("x") String mc, Pageable pageable);

	    @Query("select p from Personne p where p.id = ?1")
	    Personne findOne(Long id);

	    
	    /*

	   
	    Personne findByUsername(String username);


	    @Query("select e from Personne e where e.login = :login and e.password = :pwd")
	    public Personne authentication(@Param("login") String login, @Param("pwd") String pwd);

	    @Query("select e from Personne e where e.login = :login")
	    public Personne findByLogin(@Param("login") String login);

	    @Query("select e from Personne e where e.login = :login and e.email = :email")
	    public Personne findByEmailAndLogin(@Param("login") String login, @Param("email") String email);*/
	}


