package com.emploiemood.sn.emploiemood.dtos;


import com.emploiemood.sn.emploiemood.entites.OffreEntity;

import java.io.Serializable;
import java.util.List;

public class CategorieOffreDTO implements Serializable {

    private Long id;
    private String libelle;

    public  CategorieOffreDTO(){

    }

    public CategorieOffreDTO(Long id,
                           String libelle,
                             List<OffreEntity> offres) {
        this.id = id;
        this.libelle = libelle;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
}
