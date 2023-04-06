package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Mahasiswa;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Integer> {
}
