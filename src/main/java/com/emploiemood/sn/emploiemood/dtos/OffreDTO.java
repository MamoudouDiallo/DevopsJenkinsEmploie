package com.emploiemood.sn.emploiemood.dtos;


import com.emploiemood.sn.emploiemood.entites.CategorieEntity;

import java.io.Serializable;

public class OffreDTO implements Serializable {
    private Long id;
    private String titre;
    private String description;

    public OffreDTO(){

    }

    public OffreDTO(Long id,
                       String titre,
                       String description,
                        CategorieEntity categorie) {
        this.id = id;
        this.titre = titre;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
