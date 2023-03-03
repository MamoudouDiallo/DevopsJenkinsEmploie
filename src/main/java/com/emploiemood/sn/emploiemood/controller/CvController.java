package com.emploiemood.sn.emploiemood.controller;


import com.emploiemood.sn.emploiemood.dtos.CvDTO;
import com.emploiemood.sn.emploiemood.entites.CvEntity;
import com.emploiemood.sn.emploiemood.service.CvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class CvController {
    @Autowired
    CvService cvservice;

    @PostMapping("/cv")
    public CvDTO addAuthor(@RequestBody CvDTO cv) {
        return cvservice.addCV(cv);
    }

    @PutMapping("/cv/{id}")
    public CvDTO editAuthor(@RequestBody CvDTO cv, @PathVariable Long id) {
        return cvservice.editCV(cv, id);
    }

    @GetMapping("/cv")
    public List<CvEntity> getCv() {
        return cvservice.getCv();
    }

    @GetMapping("/cv/{id}")
    public CvEntity getCv( @PathVariable Long id) {
        return cvservice.getCv(id);
    }

    @DeleteMapping("/cv/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        cvservice.deleteCv(id);
    }
}
