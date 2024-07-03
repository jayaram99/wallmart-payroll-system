package Walmart.payroll.mappers;

import Walmart.payroll.DTO.EmployeeDTO;
import Walmart.payroll.entity.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EmployeeMapper implements Mapper<Employee, EmployeeDTO> {

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public EmployeeDTO toDto(Employee entity) {
        return modelMapper.map(entity, EmployeeDTO.class);
    }

    @Override
    public Employee toEntity(EmployeeDTO dto) {
        return modelMapper.map(dto, Employee.class);
    }
}







