package com.example.iheb.services;

import com.example.iheb.entities.classManagement;
import com.example.iheb.entities.prof;

import java.util.List;

public interface IprofService {

    public List<prof> getAll();
    public prof ajprof(prof p );
    public List<prof> retrieveAll();
    public void remove(int idprof);
    public prof update(int id,prof p);

    List<prof> getProfClass(int idClass);
}
