package Walmart.payroll.service;

import Walmart.payroll.DTO.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO getEmployeeById(int id);
    String createEmployee(EmployeeDTO employeeDTO);
    String updateEmployee(EmployeeDTO employeeDTO);
    String deleteEmployee(int id);
}
