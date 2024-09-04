package com.example.iheb.entities;

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
public class classManagement implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idclass;
    private String nomClass;
    private String filiere ;

    @OneToMany(mappedBy = "classM", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    //@JsonIgnore
    private List<etudiant> etudiants = new ArrayList<>();

    @OneToMany(mappedBy = "classMa", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    //@JsonIgnore
    private List<prof> profs = new ArrayList<>();



}
