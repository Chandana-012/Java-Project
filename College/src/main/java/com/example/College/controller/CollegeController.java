package com.example.College.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.College.entity.College;
import com.example.College.service.CollegeService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/College")
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    @PostMapping("/add")
    public College addCollege(@RequestBody College college) {
        return collegeService.saveCollege(college);
    }

    @GetMapping("/all")
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }

    @GetMapping("/{id}")
    public Optional<College> getCollegeById(@PathVariable Long id) {
        return collegeService.getCollegeById(id);
    }

    @PutMapping("/update/{id}")
    public College updateCollege(@PathVariable Long id, @RequestBody College college) {
        college.setId(id);
        return collegeService.saveCollege(college);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCollege(@PathVariable Long id) {
        collegeService.deleteCollege(id);
        return "College deleted with ID: " + id;
    }
}

