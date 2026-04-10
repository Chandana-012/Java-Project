package com.example.College.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.College.entity.College;

public interface CollegeRepo extends JpaRepository<College, Long> {
    // Marker interface — CRUD methods come from JpaRepository
}
