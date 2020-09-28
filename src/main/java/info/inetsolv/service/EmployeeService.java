package info.inetsolv.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.inetsolv.dao.Employeedao;
import info.inetsolv.formobject.Employee;

@Service
public class EmployeeService {
	@Autowired
	private Employeedao employeedao;

	public Employeedao getEmployeedao() {
		return employeedao;
	}

	public void setEmployeedao(Employeedao employeedao) {
		this.employeedao = employeedao;
	}

	public int Storeempdetails(Employee e) {

		return employeedao.Storedetailsemp(e);

	}
}
