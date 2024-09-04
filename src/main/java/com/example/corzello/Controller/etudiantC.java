package com.example.iheb.controller;

import com.example.iheb.entities.prof;
import com.example.iheb.entities.etudiant;
import com.example.iheb.services.IetudiantService;
import com.example.iheb.services.IprofService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

@RestController
@RequestMapping("/etudiant")
@AllArgsConstructor
public class etudiantC {

    IetudiantService ietudiantService ;

    @PostMapping("/add")
    @ResponseBody
    public etudiant ajouteretudiant (@RequestBody etudiant e){
        return ietudiantService.ajetudiant(e);
    }
    @GetMapping("/all")
    public List<etudiant> retrieveAll() {
        return ietudiantService.getAll();
    }

}
