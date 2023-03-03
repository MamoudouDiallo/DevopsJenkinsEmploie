package com.emploiemood.sn.emploiemood.controller;

import com.emploiemood.sn.emploiemood.dtos.OffreDTO;
import com.emploiemood.sn.emploiemood.entites.OffreEntity;
import com.emploiemood.sn.emploiemood.service.OffreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class OffreController {
    @Autowired
    OffreService offreservice;

    @PostMapping("/offre")
    public OffreDTO addOffre(@RequestBody OffreDTO offre) {
        return offreservice.addOffre(offre);
    }

    @PutMapping("/offre/{id}")
    public OffreDTO editOffre(@RequestBody OffreDTO offre, @PathVariable Long id) {
        return offreservice.editOffre(offre, id);
    }

    @GetMapping("/offre")
    public List<OffreEntity> getOffre() {
        return offreservice.getOffre();
    }

    @GetMapping("/offre/{id}")
    public OffreEntity getOffre( @PathVariable Long id) {
        return offreservice.getOffre(id);
    }

    @DeleteMapping("/offre/{id}")
    public void deleteOffre(@PathVariable Long id) {
        offreservice.deleteOffre(id);
    }
}
