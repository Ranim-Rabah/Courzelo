package com.example.iheb.controller;

import com.example.iheb.entities.Assignment;
import com.example.iheb.entities.AssignmentEtudiant;
import com.example.iheb.entities.etudiant;
import com.example.iheb.services.AssignmentEtudiantService;
import com.example.iheb.services.IAssignmentEtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

public class AssignmentEtudiantController {

    private IAssignmentEtudiantService assignmentEtudiantService;
    @PostMapping("/assignment/{idAssignment}/etudiant/{idEtudiant}")
    public AssignmentEtudiant addAssignmentEtudiant(@RequestBody AssignmentEtudiant assignmentEtudiant, @PathVariable int idAssignment,@PathVariable int idEtudiant) {
        return assignmentEtudiantService.addAssignmentEtudiant( assignmentEtudiant,  idAssignment,  idEtudiant);
    }

    public void delete(int idAssignment, int idEtudiant) {

    }
}
