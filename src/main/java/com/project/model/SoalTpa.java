package com.project.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "soal_tpa")
public class SoalTpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tpa", nullable = false)
    private Integer id_tpa;
    
    @Column(name = "isi_soal", nullable = false, columnDefinition = "TEXT")
    private String isi_soal;
    
    @Column(name = "jwb_a", nullable = false)
    private String jwb_a;
    
    @Column(name = "jwb_b", nullable = false)
    private String jwb_b;
    
    @Column(name = "jwb_c", nullable = false)
    private String jwb_c;
    
    @Column(name = "jwb_d", nullable = false)
    private String jwb_d;
}