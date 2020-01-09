package com.dev.sitting20.Repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.dev.sitting20.Entities.Sitter;

@Repository
public interface SitterRepository extends JpaRepository<Sitter, Long> {
   /* @Query("select p from Sitter p where p.nom like :x")
    public Page<Sitter> chercher(@Param("x") String mc, Pageable pageable);*/

    @Query("select p from Sitter p where p.id = ?1")
    Sitter findOne(Long id);
}