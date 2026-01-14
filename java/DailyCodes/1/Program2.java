


import java.util.*;

class ScannerDemoo{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee name:");
		String empName = sc.next();

		System.out.println("Enter Employee ID:");
		int empId = sc.nextInt();

		System.out.println("Emter Employee Salary:");
		float empSalary = sc.nextFloat();

		System.out.println("Employee Name:" + empName);
		System.out.println("Employee ID:" + empId);
		System.out.println("Employee Salary:" + empSalary);
	
	}

}
