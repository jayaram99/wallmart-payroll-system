package Walmart.payroll.controllers;

import Walmart.payroll.DTO.EmployeeDTO;
import Walmart.payroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/addemp")
    public String addEmployee(@RequestBody EmployeeDTO employee){
       return employeeService.createEmployee(employee);

    }

    @GetMapping("getemp{id}")
    public EmployeeDTO getEmployee(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("getemp")
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }
    @PutMapping("update")
    public String updateEmployee(@RequestBody EmployeeDTO employee){
        return employeeService.updateEmployee(employee);
    }
    @DeleteMapping("delete{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }
}
