package com.emploiemood.sn.emploiemood.service;

import com.emploiemood.sn.emploiemood.dtos.OffreDTO;
import com.emploiemood.sn.emploiemood.entites.OffreEntity;

import java.util.List;

public interface OffreService {
    OffreDTO addOffre(OffreDTO offreDTO);
    OffreDTO editOffre(OffreDTO offreDTO, Long id);

    List<OffreEntity> getOffre();
    OffreEntity getOffre(Long id);
    void deleteOffre(Long id);
}
