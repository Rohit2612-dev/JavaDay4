import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import org.ycpait.EmpManagementSystem.entity.Developer;
import org.ycpait.EmpManagementSystem.entity.Employee;
import org.ycpait.EmpManagementSystem.entity.SalesPerson;

public class TestEmployeeSystem 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee e = null;
		SalesPerson sP = null;
		Developer d = null;
		
		List<Employee> employee = new ArrayList<Employee>();
		
		int choice= 0;
		do {
			System.out.println("\nEmployee Management System!");
			System.out.println("-------------------------- ");
			System.out.println("1.REGISTER Employee ");
			System.out.println("2.DISPLAY Employee");
			System.out.println("3.SORT by Salary");
			System.out.println("4.SORT by Name");
			System.out.println("0.EXIT ......");
			System.out.println("Enter your choice: ");
			
			choice = sc.nextInt();			
			switch(choice) {
			case 1:
				e = new Employee("Rohit",22, 500000.00f);
				sP = new SalesPerson("Chiku",23, 30000.0f, 50, 200);
				d = new Developer("Geetu",24, 60000.0f, 10000);
				System.out.println("Registered Successfully! ");
			break;
			
			case 2:
				if(e != null) {
					System.out.println();
					e.showDetails();
					System.out.println("----------------");
					sP.showDetails();
					System.out.println("----------------");
					d.showDetails();
				}
				else {
					System.out.println("No Employee Registered yet!");
				}
				break;
			case 3:
				Collections.sort();
				
				for(Employee Stu : employee) {
					if(Stu != null)
						System.out.println(Stu);
				}
				break;
				
			case 4:
				Collections.sort(employee, (e1,e2)->e1.getName().compareTo(e2.getName()));
				
				for (Employee Stu : employee) {
					if(Stu != null)
						System.out.println(Stu);
				}
				break;
				
			case 0:
                System.out.println("Exiting... Thank you!");
                break;
				
			default:
                System.out.println("Invalid choice! Try again.");
                break;	
			}
			
		}
		while(choice != 0);
		
		sc.close();
	}
}

