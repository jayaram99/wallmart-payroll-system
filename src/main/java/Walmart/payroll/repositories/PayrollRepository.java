package Walmart.payroll.repositories;

import Walmart.payroll.entity.Payroll;

import org.springframework.data.repository.CrudRepository;

public interface PayrollRepository extends CrudRepository<Payroll, Integer> {
}
