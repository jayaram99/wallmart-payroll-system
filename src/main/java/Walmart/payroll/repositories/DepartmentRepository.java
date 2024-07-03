package Walmart.payroll.repositories;

import Walmart.payroll.entity.Department;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department,Integer> {
}
