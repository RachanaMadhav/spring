package mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import beans.Employee;

@Repository
public class EmployeeDaoImpl {
	
	public List<Employee> getEmpls(){
		List<Employee> emplist=new ArrayList<Employee>();
		emplist.add(new Employee(101,"aaads",5000));
		emplist.add(new Employee(102,"ews",46000));
		emplist.add(new Employee(103,"jgaaads",4500));
		return emplist;
		
	}
}
