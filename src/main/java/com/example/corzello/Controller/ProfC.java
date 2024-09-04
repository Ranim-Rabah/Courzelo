package com.example.iheb.controller;

import com.example.iheb.entities.prof;
import com.example.iheb.services.IprofService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")

@RestController
@RequestMapping("/prof")
@AllArgsConstructor
public class ProfC {

    IprofService iprofService ;

    @PostMapping("/add")
    @ResponseBody
    public prof ajouterprof (@RequestBody prof p){
        return iprofService.ajprof(p);
    }
    @GetMapping("/all")
    public List<prof> retrieveAll() {
        return iprofService.retrieveAll();
    }

    @PutMapping("/updatecm/{idprof}")
    public prof updateclassManagement(@PathVariable int idprof, @RequestBody prof profx) {
        return iprofService.update(idprof,profx);
    }

    @DeleteMapping("/{idprof}")
    public void removeclass(@PathVariable int idprof) {
        iprofService.remove(idprof);
    }

    @GetMapping("/class/{idClass}")
    public List<prof> getidclass(@PathVariable int idClass) {
        return iprofService.getProfClass(idClass);
    }





}
