package info.inetsolv.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import info.inetsolv.formobject.Employee;
import info.inetsolv.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	public EmployeeService employeeservice;

	public EmployeeService getEmployeeservice() {
		return employeeservice;
	}

	public void setEmployeeservice(EmployeeService employeeservice) {
		this.employeeservice = employeeservice;
	}
	
	public int Store(Employee e){
		return employeeservice.Storeempdetails(e);
						
		}
    @RequestMapping("/")
	public String display(Employee employee) {
		
		return "home.jsp";
		
	}
    @RequestMapping("/emp")
    public String storeEmpDetails(@Valid Employee employee,BindingResult result){
    	
    	System.out.println(result.getErrorCount());
    	List<ObjectError> list = result.getAllErrors();
    	for (ObjectError key : list) {
			System.out.println(list);
		}
    	if(result.getErrorCount()>0){
    		return"home.jsp";
    	}
    	employeeservice.Storeempdetails(employee);
    	System.out.println(employee.getEno());
    	System.out.println(employee.getName());
    	System.out.println(employee.getSalary());
    	return "emp.jsp";
    }
}
