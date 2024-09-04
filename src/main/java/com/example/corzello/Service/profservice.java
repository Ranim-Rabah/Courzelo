package com.example.iheb.services;

import com.example.iheb.entities.prof;
import com.example.iheb.repositories.Iprofrepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@AllArgsConstructor
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS })
@Slf4j
@Service
public class profservice implements IprofService {
    public Iprofrepo iprofrepo;
    @Override
    public List<prof> getAll() {
        return iprofrepo.findAll();
    }

    @Override
    public prof ajprof(prof p) {
        return iprofrepo.save(p);
    }

    @Override
    public List<prof> retrieveAll() {
        return iprofrepo.findAll();
    }

    @Override
    public void remove(int idprof) {
        prof p = iprofrepo.findById(idprof).orElse(null);
        iprofrepo.delete(p);
    }

    @Override
    public prof update(int id,prof p) {
        p.setIdprof(id);
        return iprofrepo.save(p);
    }

    @Override
    public List<prof> getProfClass(int idClass) {
        List<prof> list = iprofrepo.findAll();
        return list.stream().filter(p->p.getClassMa().getIdclass()==idClass).toList();

    }
}
