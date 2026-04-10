package com.example.College.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.College.entity.College;
import com.example.College.repo.CollegeRepo;

import java.util.List;
import java.util.Optional;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepo collegeRepo;

    // Create or Update
    public College saveCollege(College college) {
        return collegeRepo.save(college);
    }

    // Read all
    public List<College> getAllColleges() {
        return collegeRepo.findAll();
    }

    // Read by ID
    public Optional<College> getCollegeById(Long id) {
        return collegeRepo.findById(id);
    }

    // Delete by ID
    public void deleteCollege(Long id) {
        collegeRepo.deleteById(id);
    }
}

