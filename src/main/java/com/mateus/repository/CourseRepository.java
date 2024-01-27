package com.mateus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mateus.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
