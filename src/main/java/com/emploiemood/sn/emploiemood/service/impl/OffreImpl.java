package com.emploiemood.sn.emploiemood.service.impl;

import com.emploiemood.sn.emploiemood.dtos.OffreDTO;
import com.emploiemood.sn.emploiemood.entites.OffreEntity;
import com.emploiemood.sn.emploiemood.mapping.OffreMapper;
import com.emploiemood.sn.emploiemood.repository.OffreRepository;
import com.emploiemood.sn.emploiemood.service.OffreService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OffreImpl implements OffreService {
    @Autowired
    private OffreRepository offreRepository;
    @Autowired
    private OffreMapper offreMapper;
    @Override
    public OffreDTO addOffre(OffreDTO offreDTO) {
        OffreEntity offreEntity = offreMapper.toEntity(offreDTO);
        OffreEntity savedOffre = offreRepository.save(offreEntity);
        return offreMapper.toDto(savedOffre);
    }

    @Override
    public OffreDTO editOffre(OffreDTO offreDTO, Long id) {
        Optional<OffreEntity> offre = offreRepository.findById(id);

        if (offre.isPresent()) {
            OffreEntity offreEntity = offreMapper.toEntity(offreDTO);
            OffreEntity newOffre = offreRepository.save(offreEntity);
            return offreMapper.toDto(newOffre);
        }
        return new OffreDTO();
    }

    @Override
    public List<OffreEntity> getOffre() {
        return offreRepository.findAll();
    }
    @Override
    public OffreEntity getOffre(Long id) {
        Optional<OffreEntity> offre = offreRepository.findById(id);

        if (offre.isPresent()) {
            return offre.get();
        }
        return new OffreEntity();
    }
    @Override
    public void deleteOffre(Long id) {
        offreRepository.deleteById(id);
    }


}
