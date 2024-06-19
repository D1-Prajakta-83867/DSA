import java.util.Scanner;
public class Question4{
	
	public static Employee searchbyId(Employee []employee,int n,int id) {
		for(Employee e:employee) {
			if(e.getEmpid()==id) {
				return e;
			}
		}
		return null;
	}
	
	
	
	public static Employee searchbyName(Employee []employee,int n,String name) {
		for(Employee e:employee) {
			if(e.getName().equalsIgnoreCase(name)) {
				return e;
			}
		}
		return null;
	}
	
	
	public static Employee searchbySalary(Employee []employee,int n,double salary) {
		for(Employee e:employee) {
			if(e.getSalary()==salary) {
				return e ;
			}
		}
		return null;
	}
	
	
	
	public static void main(String[] args) {
		Employee[] e1=new Employee[] {
				new Employee(1,"Asmita",50000),
				new Employee(2,"Prajkta",40000),
				new Employee(3,"Deva",30000)
				};
		
		
		Employee emp;
		int choice;
		Scanner sc=new Scanner(System.in);
		
		
do {	
	System.out.println("0.Exit");
	System.out.println("1.Search employee by Employee id");
	System.out.println("2.Search employee by Name");
	System.out.println("3.Search employee by Salary");
	System.out.print("Enter choice:");
	choice=sc.nextInt();
	
	switch(choice) {
	case 0:
		System.out.println("Exit....");
		break;
		
	case 1:
		System.out.println("Enter employee id to search:");
		int id=sc.nextInt();
		 emp=searchbyId(e1,e1.length,id);
		if(emp!=null)
			System.out.println("Employee found by Id:"+emp);
		else
			System.out.println("Employee not found");
		break;
	
		
	case 2:
		System.out.println("Enter employee name to search:");
		String name=sc.next();
		emp=searchbyName(e1,e1.length,name);
		if(emp!=null)
			System.out.println("Employee found by name:"+emp);
		else
			System.out.println("Employee not found");
		break;
	
	 
	case 3:
		System.out.println("Enter employee salary to search:");
		double salary=sc.nextDouble();
		emp=searchbySalary(e1,e1.length,salary);
		if(emp!=null)
			System.out.println("Employee found by Id:"+emp);
		else
			System.out.println("Employee not found");
		break;
		
		
		default:
			System.out.println("Invalid choice..");
	}
			
		
	}while(choice!=0);

	}
}
