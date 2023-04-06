package com.project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mahasiswa", nullable = false)
    private Integer id_mahasiswa;

    @Column(name = "nik", nullable = false, length = 16)
    private String nik;

    @Column(name = "nisn", nullable = false, length = 10)
    private String nisn;

    @Column(name = "nama_mahasiswa", nullable = false, length = 100)
    private String nama_mahasiswa;

    @Column(name = "jenis_kelamin", nullable = false)
    private String jenis_kelamin;

    @Column(name = "tempat_lahir", nullable = false, length = 100)
    private String tempat_lahir;

    @Column(name = "tgl_lahir", nullable = false)
    private String tgl_lahir;
    
    @Column(name = "agama", nullable = false)
    private String agama;
    
    @Column(name = "alamat", nullable = false)
    private String alamat;
    
    @Column(name = "email", nullable = false)
    private String email;
    
    @Column(name = "password", nullable = false)
    private String password;
    
    @Column(name = "no_hp", nullable = false, length = 13)
    private String no_hp;

    @Column(name = "nama_sekolah", nullable = false, length = 13)
    private String nama_sekolah;

    @Column(name = "alamat_sekolah", nullable = false, length = 13)
    private String alamat_sekolah;

    @Column(name = "jurusan", nullable = false, length = 13)
    private String jurusan;

    @Column(name = "tahun_lulus", nullable = false, length = 13)
    private String tahun_lulus;

    @Column(name = "nama_ayah", nullable = false, length = 100)
    private String nama_ayah;

    @Column(name = "tempat_lahir_ayah", nullable = false, length = 100)
    private String tempat_lahir_ayah;

    @Column(name = "tgl_lahir_ayah", nullable = false)
    private String tgl_lahir_ayah;

    @Column(name = "pend_ayah", nullable = false)
    private String pend_ayah;

    @Column(name = "ph_ayah", nullable = false)
    private Integer ph_ayah;

    @Column(name = "hp_ayah", nullable = false)
    private String hp_ayah;
    
    @Column(name = "nama_ibu", nullable = false, length = 100)
    private String nama_ibu;

    @Column(name = "tempat_lahir_ibu", nullable = false, length = 100)
    private String tempat_lahir_ibu;

    @Column(name = "tgl_lahir_ibu", nullable = false)
    private String tgl_lahir_ibu;

    @Column(name = "pend_ibu", nullable = false)
    private String pend_ibu;

    @Column(name = "ph_ibu", nullable = false)
    private Integer ph_ibu;

    @Column(name = "hp_ibu", nullable = false)
    private String hp_ibu;

    @Column(name = "fakultas", nullable = false)
    private String fakultas;
}
