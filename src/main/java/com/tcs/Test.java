package com.tcs;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee emp[] = new Employee[5]; // Corrected the array size to 2
        System.out.println(emp.length);

        for (int i = 0; i <=emp.length-1; i++) { // Changed <= to < for correct iteration
            emp[i] = new Employee(); // Initialize each array element

            System.out.println("Enter id:");
            int id = sc.nextInt();
            emp[i].setId(id);

            System.out.println("Enter name:");
            String name = sc.next();
            emp[i].setName(name); 

            System.out.println("Enter marks:");
            int marks = sc.nextInt();
            emp[i].setMarks(marks);
        }

        System.out.println("Enter a character to search for in names:");

        String sequ = sc.next();

        for (Employee employee : emp) {
            if (employee.getMarks() >= 99) {
                if (employee.getName().contains(sequ)) {
                    System.out.println(employee.toString());
                }else
                	System.out.println("there");
            }
        }
    }
}
