package com.example.iheb.repositories;

import com.example.iheb.entities.Assignment;
import com.example.iheb.entities.AssignmentEtudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssignmentEtudiantRepo  extends JpaRepository<AssignmentEtudiant,Integer> {
}
