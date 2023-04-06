package com.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MahasiswaDto {
    private String nik;
    private String nisn;
    private String nama_mahasiswa;
    private String jenis_kelamin;
    private String tempat_lahir;
    private String tgl_lahir;
    private String agama;
    private String email;
    private String password;
    private String no_hp;
    private String nama_sekolah;
    private String alamat_sekolah;
    private String jurusan;
    private String tahun_lulus;
    private String nama_ayah;
    private String tempat_lahir_ayah;
    private String tgl_lahir_ayah;
    private String pend_ayah;
    private Integer ph_ayah;
    private String hp_ayah;
    private String nama_ibu;
    private String tempat_lahir_ibu;
    private String tgl_lahir_ibu;
    private String pend_ibu;
    private Integer ph_ibu;
    private String hp_ibu;
    private String fakultas;
}
