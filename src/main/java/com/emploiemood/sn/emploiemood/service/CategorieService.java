package com.emploiemood.sn.emploiemood.service;

import com.emploiemood.sn.emploiemood.dtos.CategorieOffreDTO;
import com.emploiemood.sn.emploiemood.entites.CategorieEntity;

import java.util.List;

public interface CategorieService {
    CategorieOffreDTO addCategorie(CategorieOffreDTO categorieOffreDTO);
    CategorieOffreDTO editCategorie(CategorieOffreDTO categorieOffreDTO, Long id);

    List<CategorieEntity> getCategorie();
    CategorieEntity getCategorie(Long id);
    void deleteCategorie(Long id);
}
