package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dto.SoalTpaDto;
import com.project.model.SoalTpa;
import com.project.repository.SoalTpaRepository;

@RestController
@RequestMapping("/soal-tpa")
public class SoalTpaController {
    
    SoalTpaRepository soalTpaRepository;

    @Autowired
    public SoalTpaController(SoalTpaRepository soalTpaRepository){
        this.soalTpaRepository = soalTpaRepository;
    }

    @GetMapping("/find-all")
    public Object findAll(){
        return soalTpaRepository.findAll();
    }

    @PostMapping("/")
    public Object create (@RequestBody SoalTpaDto soalTpaDto){
        SoalTpa soalTpa = new SoalTpa();
        soalTpa.setIsi_soal(soalTpaDto.getIsi_soal());
        soalTpa.setJwb_a(soalTpaDto.getJwb_a());
        soalTpa.setJwb_b(soalTpaDto.getJwb_b());
        soalTpa.setJwb_c(soalTpaDto.getJwb_c());
        soalTpa.setJwb_d(soalTpaDto.getJwb_d());
        return soalTpaRepository.save(soalTpa);
    }

    @PutMapping("/{id}")
    public Object update(@PathVariable("id") Integer id, @RequestBody SoalTpaDto soalTpaDto){
        SoalTpa soalTpa = soalTpaRepository.findById(id).orElse(null);
        if(soalTpa == null){
            return ResponseEntity.badRequest().body("Nomor soal tidak ditemukan");
        }
        soalTpa.setIsi_soal(soalTpaDto.getIsi_soal());
        soalTpa.setJwb_a(soalTpaDto.getJwb_a());
        soalTpa.setJwb_b(soalTpaDto.getJwb_b());
        soalTpa.setJwb_c(soalTpaDto.getJwb_c());
        soalTpa.setJwb_d(soalTpaDto.getJwb_d());
        return soalTpaRepository.save(soalTpa);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable("id") Integer id){
        SoalTpa soalTpa = soalTpaRepository.findById(id).orElse(null);
        if(soalTpa == null){
            return ResponseEntity.badRequest().body("Nomor soal tidak ditemukan");
        }
        soalTpaRepository.delete(soalTpa);
        return ResponseEntity.badRequest().body("Soal berhasil dihapus");
    }
}
