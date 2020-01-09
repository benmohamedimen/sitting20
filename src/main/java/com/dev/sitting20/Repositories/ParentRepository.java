package com.dev.sitting20.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.dev.sitting20.Entities.Parent;

@Repository
public interface ParentRepository extends JpaRepository<Parent, Long> {
   /* @Query("select p from Parent p where p.nom like :x")
    public Page<Parent> chercher(@Param("x") String mc, Pageable pageable);*/

    @Query("select p from Parent p where p.id = ?1")
    Parent findOne(Long id);

}