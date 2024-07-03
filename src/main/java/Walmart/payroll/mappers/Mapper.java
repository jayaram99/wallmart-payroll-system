package Walmart.payroll.mappers;

import Walmart.payroll.DTO.EmployeeDTO;
import Walmart.payroll.entity.Employee;

public interface Mapper <E, D>{
    D toDto(E entity);
    E toEntity(D dto);


}
