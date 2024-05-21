package Walmart.payroll.controllers;

import Walmart.payroll.entity.Payroll;
import Walmart.payroll.repositories.PayrollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PayrollController {

    @Autowired
    private PayrollRepository payrollRepository;

    @PostMapping("/addpay")
    public int addPayroll(@RequestBody Payroll payroll) {
        payrollRepository.save(payroll);
        return payroll.getId();
    }

    @GetMapping("/getpay{id}")
    public Payroll getAllPayrolls(@PathVariable int id) {
        return payrollRepository.findById(id).get();

    }
}
