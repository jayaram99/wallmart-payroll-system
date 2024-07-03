package Walmart.payroll.service;

import Walmart.payroll.DTO.EmployeeDTO;

import java.util.List;

public interface DepartmentService {
    List<EmployeeDTO> getEmployees();
    EmployeeDTO getEmployeeById(int id);
    int createEmployee(EmployeeDTO employeeDTO);
    int updateEmployee(EmployeeDTO employeeDTO);


}
