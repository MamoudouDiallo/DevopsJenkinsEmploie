package com.emploiemood.sn.emploiemood.entites;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name = "Categories")
public class CategorieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String libelle;
    @OneToMany(mappedBy = "categorie")
    private List<OffreEntity> offres;

    public  CategorieEntity(){

    }

    public CategorieEntity(Long id,
                           String libelle,
                           List<OffreEntity> offres) {
        this.id = id;
        this.libelle = libelle;
        this.offres = offres;
    }

    public List<OffreEntity> getOffres() {
        return offres;
    }

    public void setOffres(List<OffreEntity> offres) {
        this.offres = offres;
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
