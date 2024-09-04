package com.example.iheb.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Assignment implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idassignment;
    private String question;
    @OneToMany(mappedBy = "assignment",fetch = FetchType.LAZY,cascade = CascadeType.ALL, orphanRemoval = true)
    List<AssignmentEtudiant> etudiants ;
    @ManyToOne
    @JsonIgnore
    prof prof;

}
