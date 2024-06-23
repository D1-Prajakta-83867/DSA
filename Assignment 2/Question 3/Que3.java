import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
	class Employee implements Comparable<Employee> {
	    private String name;
	    private double salary;

	    public Employee(String name, double salary) {
	        this.name = name;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	
	    public double getSalary() {
	        return salary;
	    }

	    @Override
	    public int compareTo(Employee other) {
	        return Double.compare(this.salary, other.salary);
	    }

	    @Override
	    public String toString() {
	        return "Employee{name='" + name + "', salary=" + salary + '}';
	    }
	}
	public class Que3 {
	    public static void main(String[] args) {
	        List<Employee> employees = new ArrayList<>();
	        employees.add(new Employee("ram", 50000));
	        employees.add(new Employee("sham", 60000));
	        employees.add(new Employee("raj", 25000));
	        employees.add(new Employee("jay", 70000));

	        System.out.println("Employees before sorting:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }

	        Collections.sort(employees);

	        System.out.println("\nEmployees after sorting by salary:");
	        for (Employee emp : employees) {
	            System.out.println(emp);
	        }
	    }
	}

