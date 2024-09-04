package com.example.iheb.repositories;

import com.example.iheb.entities.etudiant;
import com.example.iheb.entities.prof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Iprofrepo extends JpaRepository<prof,Integer> {
}
