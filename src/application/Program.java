package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("HOW MANNY EMPLOYEES WILL BE REGISTERED? ");
		int reg = sc.nextInt();
		
		for(int i = 1; i <= reg; i++) {
			System.out.println();
			System.out.println("EMPLOYEE #" + i + ":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			System.out.print("NAME: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("SALARY: $");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.print("ENTER THE EMPLOYEE ID THAT WILL HAVE SALARY INCREASE: ");
		int idIncrease = sc.nextInt();
		Integer pos = position(list, idIncrease); {
			if (pos == null) {
				System.out.println("THE ID DOES NOT EXIST!");
			} else {
				System.out.print("ENTER THE PERCENTAGE: ");
				double percentage = sc.nextDouble();
				list.get(pos).increaseSalary(percentage);
			}
			
			System.out.println();
			System.out.println("LIST OF EMPLOYEES:");
			for(Employee emp : list) {
				System.out.println(emp);
			}
		}
		
		
		sc.close();

	}
	
	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
