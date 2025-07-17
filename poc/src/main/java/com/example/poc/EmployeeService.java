package com.example.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployeeData(Employee emp) {
        return employeeRepository.save(emp);
    }

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeByID(long empID) {
        return employeeRepository.findById(empID).get();
    }

    public Employee updateEmployee(long empId) {
        return employeeRepository.findById(empId).map(employee ->
                {
                    employee.setAddress("Address1");
                    employee.setSal(1000);
                    employee.setEmpName("Employee1");
                    return employeeRepository.save(employee);
                }).orElseThrow();
    }

    public void deleteEmployee(long empID) {
        if(employeeRepository.findById(empID).isPresent()) {
            employeeRepository.deleteById(empID);
        }
    }
}
