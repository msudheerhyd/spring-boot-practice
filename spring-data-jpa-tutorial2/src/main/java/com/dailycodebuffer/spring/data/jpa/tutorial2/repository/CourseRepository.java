package com.dailycodebuffer.spring.data.jpa.tutorial2.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial2.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
