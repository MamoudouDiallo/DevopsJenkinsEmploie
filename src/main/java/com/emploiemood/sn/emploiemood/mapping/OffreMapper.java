package com.emploiemood.sn.emploiemood.mapping;

import com.emploiemood.sn.emploiemood.dtos.OffreDTO;
import com.emploiemood.sn.emploiemood.entites.OffreEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OffreMapper {
    OffreEntity toEntity(OffreDTO offreDTO);
    OffreDTO toDto(OffreEntity offreEntity);
}
