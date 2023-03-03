package com.emploiemood.sn.emploiemood.entites;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "offres")
public class OffreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String titre;
    private String description;
    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private CategorieEntity categorie;

    public OffreEntity(){

    }

    public OffreEntity(Long id,
                       String titre,
                       String description,
                       CategorieEntity categorie) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.categorie = categorie;

    }

    public CategorieEntity getCategorie() {
        return categorie;
    }

    public void setCategorie(CategorieEntity categorie) {
        this.categorie = categorie;
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
