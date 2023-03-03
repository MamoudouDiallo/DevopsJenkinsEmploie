package com.emploiemood.sn.emploiemood.mapping;

import com.emploiemood.sn.emploiemood.dtos.CvDTO;
import com.emploiemood.sn.emploiemood.entites.CvEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CvMapper {
    CvEntity toEntity(CvDTO cvDTO);
    CvDTO toDto(CvEntity cvEntity);
}
