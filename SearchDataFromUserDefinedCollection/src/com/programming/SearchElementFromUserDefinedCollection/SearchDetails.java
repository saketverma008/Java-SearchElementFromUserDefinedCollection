package com.programming.SearchElementFromUserDefinedCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SearchDetails {

	public static void main(String[] args) {
		List<EmployeeDetails> lst = new ArrayList<EmployeeDetails>();
		lst.add(new EmployeeDetails("saket", "verma", 25, 2000));
		lst.add(new EmployeeDetails("anurag", "singh", 35, 5000));
		Scanner s = new Scanner(System.in);
		char ch;
		do {
			System.out.println("1: Search By Name");
			System.out.println("2: Search By Age");
			System.out.println("3: Search By Salary");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the name to search details");
				String searchString = s.next();
				for (final EmployeeDetails emp : lst) {
					if (emp.getFName().equals(searchString)) {
						System.out.println(
								emp.getFName() + ":" + emp.getLName() + ":" + emp.getAge() + ":" + emp.getSalary());
						System.out.println("\nDo you want to continue (Type y or n) \n");
						break;
					}
				}
				break;
			case 2:
				System.out.println("Enter the age to search details");
				int searchAge = s.nextInt();
				for (final EmployeeDetails emp : lst) {
					if (emp.getAge() == (searchAge)) {
						System.out.println(
								emp.getFName() + ":" + emp.getLName() + ":" + emp.getAge() + ":" + emp.getSalary());
						System.out.println("\nDo you want to continue (Type y or n) \n");
						break;
					}
				}
				break;
			case 3:
				System.out.println("Enter the salary to search details");
				double searchSalary = s.nextInt();
				for (final EmployeeDetails emp : lst) {
					if (emp.getSalary() == (searchSalary))
						System.out.println(
								emp.getFName() + ":" + emp.getLName() + ":" + emp.getAge() + ":" + emp.getSalary());
					System.out.println("\nDo you want to continue (Type y or n) \n");
					break;
				}
				break;
			default:
				System.out.println("Inavlid input");
				System.out.println("\nDo you want to continue (Type y or n) \n");
				break;
			}
			ch = s.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}
