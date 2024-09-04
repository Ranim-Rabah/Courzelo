package com.example.iheb.repositories;

import com.example.iheb.entities.etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Ietudiantrepository extends JpaRepository<etudiant,Integer> {
}
