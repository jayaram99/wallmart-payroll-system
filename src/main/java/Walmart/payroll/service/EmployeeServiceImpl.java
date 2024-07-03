package Walmart.payroll.service;

import Walmart.payroll.DTO.EmployeeDTO;
import Walmart.payroll.entity.Employee;
import Walmart.payroll.mappers.EmployeeMapper;
import Walmart.payroll.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
     private EmployeeRepository employeeRepository;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        Iterable<Employee> employees = employeeRepository.findAll();
        return StreamSupport.stream(employees.spliterator(), false)
                .map(employeeMapper::toDto)
                .collect(Collectors.toList());
    }
    @Override
    public EmployeeDTO getEmployeeById(int id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employeeMapper.toDto(employee.orElse(null));
    }

    @Override
    public String createEmployee(EmployeeDTO employeeDTO) {
        return employeeRepository.save(employeeMapper.toEntity(employeeDTO)).getName();
    }

    @Override
    public String updateEmployee(EmployeeDTO employeeDTO) {
        int id = employeeDTO.getid();
        Optional<Employee> employee = employeeRepository.findById(id);
        if(employee.isPresent()){
            Employee emp = employee.get();
            emp.setName(employeeDTO.getname());
            emp.setSurName(employeeDTO.getsurName());
            emp.setEmail(employeeDTO.getemail());
            emp.setPhone(employeeDTO.getphone());
            emp.setSalary(employeeDTO.getSalary());
            emp.setAddress(employeeDTO.getAddress());
            employeeRepository.save(emp);
            return employeeRepository.save(employeeMapper.toEntity(employeeDTO)).getName();
        }
        else
            return "Employee"+employeeDTO.getid()+" not found";

    }
    public String deleteEmployee(int id) {
        employeeRepository.deleteById(id);
        return "Deleted"+id+"Successfully";
    }
}
