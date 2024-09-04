package com.example.iheb.repositories;

import com.example.iheb.entities.Assignment;
import com.example.iheb.entities.prof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAssignmentrepo extends JpaRepository<Assignment,Integer> {
}
