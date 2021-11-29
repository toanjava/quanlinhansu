package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Office;

@Repository
public interface OfficeRepository extends JpaRepository<Office, Integer> {

}
