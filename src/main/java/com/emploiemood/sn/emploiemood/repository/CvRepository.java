package com.emploiemood.sn.emploiemood.repository;

import com.emploiemood.sn.emploiemood.entites.CvEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CvRepository extends JpaRepository<CvEntity, Long> {

}
