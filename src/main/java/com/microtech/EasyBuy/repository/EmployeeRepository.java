package com.microtech.EasyBuy.repository;

import com.microtech.EasyBuy.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee , Integer>{

}
