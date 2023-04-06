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

import com.project.dto.SoalWawancaraDto;
import com.project.model.SoalWawancara;
import com.project.repository.SoalWawancaraRepository;

@RestController
@RequestMapping("/soal-wawancara")
public class SoalWawancaraController {
    
    SoalWawancaraRepository soalWawancaraRepository;

    @Autowired
    public SoalWawancaraController(SoalWawancaraRepository soalWawancaraRepository){
        this.soalWawancaraRepository = soalWawancaraRepository;
    }

    @GetMapping("/find-all")
    public Object findAll(){
        return soalWawancaraRepository.findAll();
    }

    @PostMapping("/")
    public Object create (@RequestBody SoalWawancaraDto soalWawancaraDto){
        SoalWawancara soalWawancara = new SoalWawancara();
        soalWawancara.setIsi_soal(soalWawancaraDto.getIsi_soal());
        soalWawancara.setJwb_a(soalWawancaraDto.getJwb_a());
        soalWawancara.setJwb_b(soalWawancaraDto.getJwb_b());
        soalWawancara.setJwb_c(soalWawancaraDto.getJwb_c());
        soalWawancara.setJwb_d(soalWawancaraDto.getJwb_d());
        return soalWawancaraRepository.save(soalWawancara);
    }

    @PutMapping("/{id}")
    public Object update (@PathVariable("id") Integer id, @RequestBody SoalWawancaraDto soalWawancaraDto){
        SoalWawancara soalWawancara = soalWawancaraRepository.findById(id).orElse(null);
        if(soalWawancara == null){
            return ResponseEntity.badRequest().body("Nomor soal tidak ditemukan");
        }
        soalWawancara.setIsi_soal(soalWawancaraDto.getIsi_soal());
        soalWawancara.setJwb_a(soalWawancaraDto.getJwb_a());
        soalWawancara.setJwb_b(soalWawancaraDto.getJwb_b());
        soalWawancara.setJwb_c(soalWawancaraDto.getJwb_c());
        soalWawancara.setJwb_d(soalWawancaraDto.getJwb_d());
        return soalWawancaraRepository.save(soalWawancara);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable("id") Integer id){
        SoalWawancara soalWawancara = soalWawancaraRepository.findById(id).orElse(null);
        if(soalWawancara == null){
            return ResponseEntity.badRequest().body("Nomor soal tidak ditemukan");
        }
        soalWawancaraRepository.delete(soalWawancara);
        return ResponseEntity.badRequest().body("Soal berhasil dihapus");
    }
}
