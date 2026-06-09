package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employees")
@CrossOrigin(origins = "*") 
public class EmployeeController {

    @Autowired
    private EmployeeRepository repository;

    //gets all employees
    @GetMapping
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    // create and adds new employee
    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return repository.save(employee);
    }




    //updating employee
    @PutMapping("/{id}") 
    public Employee updateEmployee(@PathVariable Long id,@RequestBody Employee updatedEmployee)
    {
            Employee employee = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Employee not found"));

            employee.setName(updatedEmployee.getName());
            employee.setBirthdate(updatedEmployee.getBirthdate());
            employee.setGender(updatedEmployee.getGender());
            employee.setHobbies(updatedEmployee.getHobbies());
            employee.setAddress1(updatedEmployee.getAddress1());
            employee.setAddress2(updatedEmployee.getAddress2());
            employee.setCity(updatedEmployee.getCity());
            employee.setPincode(updatedEmployee.getPincode());
            employee.setPan(updatedEmployee.getPan());
            employee.setPhoto(updatedEmployee.getPhoto());
            employee.setAddressProof(updatedEmployee.getAddressProof());

            return repository.save(employee);
    }

    //Delete employee
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        repository.deleteById(id);
    }
}