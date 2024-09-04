package com.example.iheb.services;

import com.example.iheb.entities.etudiant;

import java.util.List;

public interface IetudiantService {
    public List<etudiant> getAll();
    public etudiant ajetudiant(etudiant p );
}
