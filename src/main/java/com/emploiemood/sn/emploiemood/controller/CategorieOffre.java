package com.emploiemood.sn.emploiemood.controller;


import com.emploiemood.sn.emploiemood.dtos.CategorieOffreDTO;
import com.emploiemood.sn.emploiemood.entites.CategorieEntity;
import com.emploiemood.sn.emploiemood.service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CategorieOffre {
    @Autowired
    CategorieService categorieService;

    @PostMapping("/categorie")
    public CategorieOffreDTO addCategorie(@RequestBody CategorieOffreDTO categorie) {
        return categorieService.addCategorie(categorie);
    }

    @PutMapping("/categorie/{id}")
    public CategorieOffreDTO editCategorie(@RequestBody CategorieOffreDTO categorie, @PathVariable Long id) {
        return categorieService.editCategorie(categorie, id);
    }

    @GetMapping("/categorie")
    public List<CategorieEntity> getCategorie() {
        return categorieService.getCategorie();
    }

    @GetMapping("/categorie/{id}")
    public CategorieEntity getCategorie( @PathVariable Long id) {
        return categorieService.getCategorie(id);
    }

    @DeleteMapping("/categorie/{id}")
    public void deleteCategrie(@PathVariable Long id) {
        categorieService.deleteCategorie(id);
    }
}
