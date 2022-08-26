package com.dailycodebuffer.Springboottutorial2.service;

import com.dailycodebuffer.Springboottutorial2.entity.Department;
import com.dailycodebuffer.Springboottutorial2.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;
    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }
}
