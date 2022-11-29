package com.nagarro.AzureDemoApp.repo;

import com.nagarro.AzureDemoApp.com.nagarro.AzureDemoApp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Employee, Integer>{

}
