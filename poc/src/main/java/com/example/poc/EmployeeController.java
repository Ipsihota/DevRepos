package com.example.poc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployeeData(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployeeDetails() {
        return employeeService.getEmployee();
    }

    @GetMapping("/byId/{empId}")
    public Employee getEmployeeById(@PathVariable long empId) {
        return  employeeService.getEmployeeByID(empId);
    }

    @PutMapping("/updateEmployee/empId")
    public Employee updateEmployee(@PathVariable long empId) {
        return employeeService.updateEmployee(empId);
    }

    @DeleteMapping("/deleteEmployee/empId")
    public void deleteEmployee(@PathVariable long empId) {
        employeeService.deleteEmployee(empId);
    }
}