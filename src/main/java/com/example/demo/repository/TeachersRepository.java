package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Teachers;

public interface TeachersRepository extends JpaRepository<Teachers, Long>{

}
