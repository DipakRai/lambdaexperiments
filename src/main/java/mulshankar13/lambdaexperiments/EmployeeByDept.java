package mulshankar13.lambdaexperiments;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * No of Employees By Dept Through Lambda:Epsilon Interview
 * @author mulshankar13
 *
 */
public class EmployeeByDept {

	public static void main(String[] args) {
		
		List <Employee> eList = new ArrayList<Employee>();
		
		Employee e1= new Employee("Tom","ADMIOS");
		Employee e2= new Employee("Tim","ADMIOS");
		Employee e4= new Employee("Monique","ADMIMF");
		Employee e5= new Employee("Arul","ADMIMF");
		Employee e6= new Employee("Nihal","ADMIMF");
		Employee e7= new Employee("Venu","ADMIUX");
		
		eList.add(e1);
		eList.add(e2);
		eList.add(e4);
		eList.add(e5);
		eList.add(e6);
		eList.add(e7);
		System.out.println("*************print the list****************************");
		eList.forEach(System.out::println); // print the list
		System.out.println("*************print the list dept wise****************************");
		Map<String, List<Employee>> employeeByDept = 
				eList
			    .stream()
			    .collect(Collectors.groupingBy(employee -> employee.deptId));
		employeeByDept
		.forEach((deptId,name)->System.out.println(deptId+":"+name));
		
		Map<String, Long> employeeByDeptCount = 
				eList
			    .stream()
			    .collect(Collectors.groupingBy(employee -> employee.deptId, Collectors.counting()));
		System.out.println("*************print the department with the total number of employees****************************");
		
		System.out.println(employeeByDeptCount);
				
	}	
	
	static class Employee {
		String name="";
		String deptId="";
		public Employee(String name,String deptId) {
			this.name=name;
			this.deptId=deptId;
		}
		@Override
		public String toString() {
			return "name:"+name;
		}
	}
}
