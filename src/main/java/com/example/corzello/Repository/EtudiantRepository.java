package com.example.corzello.Repository;
import com.example.corzello.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EtudiantRepository  extends JpaRepository<Etudiant,Long>{
}