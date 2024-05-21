package Walmart.payroll.controllers;

import Walmart.payroll.entity.Employee;
import Walmart.payroll.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @PostMapping("/addemp")
    public void addEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
    }

    @GetMapping("getemp{id}")
    public Employee getEmployee(@PathVariable int id){
        return employeeRepository.findById(id).get();
    }
}
