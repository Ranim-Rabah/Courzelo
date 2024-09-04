package com.example.iheb.services;

import com.example.iheb.entities.Assignment;
import com.example.iheb.entities.AssignmentEtudiant;
import com.example.iheb.entities.AssignmentEtudiantId;
import com.example.iheb.entities.etudiant;
import com.example.iheb.repositories.AssignmentEtudiantRepo;
import com.example.iheb.repositories.IAssignmentrepo;
import com.example.iheb.repositories.Ietudiantrepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class AssignmentEtudiantService implements IAssignmentEtudiantService{
    private AssignmentEtudiantRepo assignmentEtudiantRepo;
    private IAssignmentrepo assignmentrepo;
    private Ietudiantrepository etudiantrepository;
    @Override
    public AssignmentEtudiant addAssignmentEtudiant(AssignmentEtudiant assignmentEtudiant, int idAssignment, int idEtudiant) {
        Assignment a =new Assignment();
        a.setIdassignment(idAssignment);
        etudiant e = new etudiant();
        e.setIdetudiant(idEtudiant);
        assignmentEtudiant.setEtudiant(e);
        assignmentEtudiant.setAssignment(a);
        assignmentEtudiant.setId(new AssignmentEtudiantId(idAssignment,idEtudiant));
        return assignmentEtudiantRepo.save(assignmentEtudiant);
    }

    @Override
    public void delete(int idAssignment, int idEtudiant) {

    }
}
