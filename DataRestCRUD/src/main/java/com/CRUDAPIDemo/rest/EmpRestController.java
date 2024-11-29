package com.CRUDAPIDemo.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.CRUDAPIDemo.Dao.EmployeeRepository;
import com.CRUDAPIDemo.entity.Employee;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:4200/")
public class EmpRestController {

	@Autowired
	private EmployeeRepository empRepo;

	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		System.out.println(employee.toString());
		return empRepo.save(employee);
	}

	@GetMapping("/employees")
	public List<Employee> getAllEmployees() {
		return empRepo.findAll();
	}

	// get by id
	@GetMapping("/employees/{Id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer Id) {
		Employee employee = empRepo.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee ID does not exist:" + Id));

		return ResponseEntity.ok(employee);

	}

	@PutMapping("/employees/{Id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable int Id, @RequestBody Employee employeeDetails) {

		Employee employee = empRepo.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee ID does not exist:" + Id));

		employee.setEmpName(employeeDetails.getEmpName());
		employee.setEmpEmail(employeeDetails.getEmpEmail());
		employee.setEmpAdress(employeeDetails.getEmpAdress());
		employee.setEmpDepartment(employeeDetails.getEmpDepartment());

		Employee updatadEmployee = empRepo.save(employee);

		return ResponseEntity.ok(updatadEmployee);

	}
	@DeleteMapping("/employees/{Id}")
	public ResponseEntity<Map<String, Boolean>> deleteEmployee(@PathVariable int Id)
	{
		Employee employee = empRepo.findById(Id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee ID does not exist:" + Id));
		empRepo.delete(employee);
		Map<String,Boolean> response=new HashMap<>();
		response.put("Deleted",Boolean.TRUE);
		
		return  ResponseEntity.ok(response);
		
	}

}
