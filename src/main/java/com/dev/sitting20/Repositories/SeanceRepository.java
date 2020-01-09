package com.dev.sitting20.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.dev.sitting20.Entities.Seance;

@Repository

public interface SeanceRepository extends JpaRepository<Seance, Long> {
	
	/*@Query("select p from Seance p where p.nom like :x")
    public Page<Seance> chercher(@Param("x") String mc, Pageable pageable);*/

    @Query("select p from Seance p where p.id = ?1")
    Seance findOne(Long id);

}
