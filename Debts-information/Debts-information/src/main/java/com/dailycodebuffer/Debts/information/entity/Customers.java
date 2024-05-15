package com.dailycodebuffer.Debts.information.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    @NotBlank(message = "Please Add Customer Name")
    private String customerName;
    private long debtTillNow;
}
