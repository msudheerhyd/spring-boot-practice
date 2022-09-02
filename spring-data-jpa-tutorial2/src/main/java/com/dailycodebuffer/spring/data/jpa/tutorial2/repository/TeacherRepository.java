package com.dailycodebuffer.spring.data.jpa.tutorial2.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial2.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
