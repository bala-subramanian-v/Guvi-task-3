import java.util.Scanner;

// Main class
class DriverMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Employee input
        System.out.print("Enter Employee ID: ");
        int eid = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Yearly Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(eid, name, salary);
        System.out.println("Income Tax: " + emp.calcTax());

        // Product input
        System.out.print("Enter Product ID: ");
        int pid = sc.nextInt();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        Product prod = new Product(pid, price, qty);
        System.out.println("Sales Tax: " + prod.calcTax());
    }
}
