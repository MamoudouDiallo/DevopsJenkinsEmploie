package com.emploiemood.sn.emploiemood.service.impl;

import com.emploiemood.sn.emploiemood.dtos.CategorieOffreDTO;
import com.emploiemood.sn.emploiemood.entites.CategorieEntity;
import com.emploiemood.sn.emploiemood.mapping.CategorieMapper;
import com.emploiemood.sn.emploiemood.repository.CategorieRepository;
import com.emploiemood.sn.emploiemood.service.CategorieService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CategorieImpl implements CategorieService {
    @Autowired
    private CategorieRepository categorieRepository;
    @Autowired
    private CategorieMapper categorieMapper;
    @Override
    public CategorieOffreDTO addCategorie(CategorieOffreDTO categorieOffreDTO) {
        CategorieEntity categorieEntity = categorieMapper.toEntity(categorieOffreDTO);
        CategorieEntity savedCategorie = categorieRepository.save(categorieEntity);
        return categorieMapper.toDto(savedCategorie);
    }

    @Override
    public CategorieOffreDTO editCategorie(CategorieOffreDTO categorieOffreDTO, Long id) {
        Optional<CategorieEntity> categorie = categorieRepository.findById(id);

        if (categorie.isPresent()) {
            CategorieEntity categorieEntity = categorieMapper.toEntity(categorieOffreDTO);
            CategorieEntity newCategorie = categorieRepository.save(categorieEntity);
            return categorieMapper.toDto(newCategorie);
        }
        return new CategorieOffreDTO();
    }

    @Override
    public List<CategorieEntity> getCategorie() {
        return categorieRepository.findAll();
    }
    @Override
    public CategorieEntity getCategorie(Long id) {
        Optional<CategorieEntity> categorie = categorieRepository.findById(id);

        if (categorie.isPresent()) {
            return categorie.get();
        }
        return new CategorieEntity();
    }
    @Override
    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }

}
