package com.emploiemood.sn.emploiemood.mapping;

import com.emploiemood.sn.emploiemood.dtos.CategorieOffreDTO;
import com.emploiemood.sn.emploiemood.entites.CategorieEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorieMapper {
    CategorieEntity toEntity(CategorieOffreDTO categorieOffreDTO);
    CategorieOffreDTO toDto(CategorieEntity categorieEntity);
}
