package com.emploiemood.sn.emploiemood.service;

import com.emploiemood.sn.emploiemood.dtos.CvDTO;
import com.emploiemood.sn.emploiemood.entites.CvEntity;

import java.util.List;

public interface CvService {
    CvDTO addCV(CvDTO cvDTO);
    CvDTO editCV(CvDTO cvDTO, Long id);

    List<CvEntity> getCv();
    CvEntity getCv(Long id);
    void deleteCv(Long id);
}
