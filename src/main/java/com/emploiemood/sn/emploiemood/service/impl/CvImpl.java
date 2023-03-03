package com.emploiemood.sn.emploiemood.service.impl;

import com.emploiemood.sn.emploiemood.dtos.CvDTO;
import com.emploiemood.sn.emploiemood.entites.CvEntity;
import com.emploiemood.sn.emploiemood.mapping.CvMapper;
import com.emploiemood.sn.emploiemood.repository.CvRepository;
import com.emploiemood.sn.emploiemood.service.CvService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CvImpl implements CvService {
    @Autowired
    private CvRepository cvRepository;
    @Autowired
    private CvMapper cvMapper;
    @Override
    public CvDTO addCV(CvDTO cvDTO) {
        CvEntity cvEntity = cvMapper.toEntity(cvDTO);
        CvEntity savedCv = cvRepository.save(cvEntity);
        return cvMapper.toDto(savedCv);
    }

    @Override
    public CvDTO editCV(CvDTO cvDTO, Long id) {
        Optional<CvEntity> cv = cvRepository.findById(id);

        if (cv.isPresent()) {
            CvEntity cvEntity = cvMapper.toEntity(cvDTO);
            CvEntity newCv = cvRepository.save(cvEntity);
            return cvMapper.toDto(newCv);
        }
        return new CvDTO();
    }

    @Transactional
    @Override
    public List<CvEntity> getCv() {
        return cvRepository.findAll();
    }
    @Override
    public CvEntity getCv(Long id) {
        Optional<CvEntity> cv = cvRepository.findById(id);

        if (cv.isPresent()) {
            return cv.get();
        }
        return new CvEntity();
    }
    @Override
    public void deleteCv(Long id) {
        cvRepository.deleteById(id);
    }

}
