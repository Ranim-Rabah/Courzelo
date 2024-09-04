package com.example.iheb.services;

import com.example.iheb.entities.AssignmentEtudiant;

public interface IAssignmentEtudiantService {

    AssignmentEtudiant addAssignmentEtudiant(AssignmentEtudiant assignmentEtudiant, int idAssignment, int idEtudiant) ;

    void delete(int idAssignment, int idEtudiant);
}
