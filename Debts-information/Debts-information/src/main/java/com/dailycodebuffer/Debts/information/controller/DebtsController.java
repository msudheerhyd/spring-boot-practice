package com.dailycodebuffer.Debts.information.controller;

import com.dailycodebuffer.Debts.information.entity.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.hibernate.tool.schema.SchemaToolingLogging.LOGGER;

@RestController
public class DebtsController {

    @GetMapping("/customers")
    public List<Customers> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return customerService.fetchDepartmentList();
    }


}
