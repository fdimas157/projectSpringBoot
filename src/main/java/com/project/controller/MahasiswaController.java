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

import com.project.model.Mahasiswa;
import com.project.dto.MahasiswaDto;
import com.project.repository.MahasiswaRepository;

@RestController
@RequestMapping("/mahasiswa")
public class MahasiswaController {
    MahasiswaRepository mahasiswaRepository;

    @Autowired
    public MahasiswaController(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }

    @GetMapping("/find-all")
    public Object findAll() {
        return mahasiswaRepository.findAll();
    }
    
    @PostMapping("/")
    public Object create(@RequestBody MahasiswaDto MahasiswaDto) {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNik(MahasiswaDto.getNik());
        mahasiswa.setNisn(MahasiswaDto.getNisn());
        mahasiswa.setNama_mahasiswa(MahasiswaDto.getNama_mahasiswa());
        mahasiswa.setJenis_kelamin(MahasiswaDto.getJenis_kelamin());
        mahasiswa.setTempat_lahir(MahasiswaDto.getTempat_lahir());
        mahasiswa.setTgl_lahir(MahasiswaDto.getTgl_lahir());
        mahasiswa.setAgama(MahasiswaDto.getAgama());
        mahasiswa.setEmail(MahasiswaDto.getEmail());
        mahasiswa.setPassword(MahasiswaDto.getPassword());
        mahasiswa.setNo_hp(MahasiswaDto.getNo_hp());
        mahasiswa.setNama_sekolah(MahasiswaDto.getNama_sekolah());
        mahasiswa.setAlamat_sekolah(MahasiswaDto.getAlamat_sekolah());
        mahasiswa.setJurusan(MahasiswaDto.getJurusan());
        mahasiswa.setTahun_lulus(MahasiswaDto.getTahun_lulus());
        mahasiswa.setNama_ayah(MahasiswaDto.getNama_ayah());
        mahasiswa.setTempat_lahir_ayah(MahasiswaDto.getTempat_lahir_ayah());
        mahasiswa.setTgl_lahir_ayah(MahasiswaDto.getTempat_lahir_ayah());
        mahasiswa.setPend_ayah(MahasiswaDto.getPend_ayah());
        mahasiswa.setPh_ayah(MahasiswaDto.getPh_ayah());
        mahasiswa.setHp_ayah(MahasiswaDto.getHp_ayah());
        mahasiswa.setNama_ibu(MahasiswaDto.getNama_ibu());
        mahasiswa.setTempat_lahir_ibu(MahasiswaDto.getTempat_lahir_ibu());
        mahasiswa.setTgl_lahir_ibu(MahasiswaDto.getTgl_lahir_ibu());
        mahasiswa.setPend_ibu(MahasiswaDto.getPend_ibu());
        mahasiswa.setPh_ibu(MahasiswaDto.getPh_ibu());
        mahasiswa.setHp_ibu(MahasiswaDto.getHp_ibu());
        mahasiswa.setFakultas(MahasiswaDto.getFakultas());
        return mahasiswaRepository.save(mahasiswa);
    }

    @PutMapping("/{id}")
    public Object update (@PathVariable("id") Integer id, @RequestBody MahasiswaDto MahasiswaDto) {
        Mahasiswa mahasiswa = mahasiswaRepository.findById(id).orElse(null);
        if(mahasiswa == null){
            return ResponseEntity.badRequest().body("id_mahasiswa tidak ditemukan");
        }
        mahasiswa.setNik(MahasiswaDto.getNik());
        mahasiswa.setNisn(MahasiswaDto.getNisn());
        mahasiswa.setNama_mahasiswa(MahasiswaDto.getNama_mahasiswa());
        mahasiswa.setJenis_kelamin(MahasiswaDto.getJenis_kelamin());
        mahasiswa.setTempat_lahir(MahasiswaDto.getTempat_lahir());
        mahasiswa.setTgl_lahir(MahasiswaDto.getTgl_lahir());
        mahasiswa.setAgama(MahasiswaDto.getAgama());
        mahasiswa.setEmail(MahasiswaDto.getEmail());
        mahasiswa.setPassword(MahasiswaDto.getPassword());
        mahasiswa.setNo_hp(MahasiswaDto.getNo_hp());
        mahasiswa.setNama_sekolah(MahasiswaDto.getNama_sekolah());
        mahasiswa.setAlamat_sekolah(MahasiswaDto.getAlamat_sekolah());
        mahasiswa.setJurusan(MahasiswaDto.getJurusan());
        mahasiswa.setTahun_lulus(MahasiswaDto.getTahun_lulus());
        mahasiswa.setNama_ayah(MahasiswaDto.getNama_ayah());
        mahasiswa.setTempat_lahir_ayah(MahasiswaDto.getTempat_lahir_ayah());
        mahasiswa.setTgl_lahir_ayah(MahasiswaDto.getTempat_lahir_ayah());
        mahasiswa.setPend_ayah(MahasiswaDto.getPend_ayah());
        mahasiswa.setPh_ayah(MahasiswaDto.getPh_ayah());
        mahasiswa.setHp_ayah(MahasiswaDto.getHp_ayah());
        mahasiswa.setNama_ibu(MahasiswaDto.getNama_ibu());
        mahasiswa.setTempat_lahir_ibu(MahasiswaDto.getTempat_lahir_ibu());
        mahasiswa.setTgl_lahir_ibu(MahasiswaDto.getTgl_lahir_ibu());
        mahasiswa.setPend_ibu(MahasiswaDto.getPend_ibu());
        mahasiswa.setPh_ibu(MahasiswaDto.getPh_ibu());
        mahasiswa.setHp_ibu(MahasiswaDto.getHp_ibu());
        mahasiswa.setFakultas(MahasiswaDto.getFakultas());
        return mahasiswaRepository.save(mahasiswa);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable("id") Integer id){
        Mahasiswa mahasiswa = mahasiswaRepository.findById(id).orElse(null);
        if(mahasiswa == null){
            return ResponseEntity.badRequest().body("id_mahasiswa tidak ditemukan");
        }
        mahasiswaRepository.delete(mahasiswa);
        return null;
    }
}
