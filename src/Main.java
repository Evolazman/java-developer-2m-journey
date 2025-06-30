import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Scanner;

import day2.*;

import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        // สร้าง List ของ Person
//        List<Person> people = new ArrayList<>();
//
//        // เราสามารถเพิ่มได้ทั้ง Person, Employee, และ Manager!
//        people.add(new Person("Terakan" , "Pumpoem" , 30));
//        people.add(new Employee("Thananya" , "Sriwichain" , 35 , "E001" , "Event" , 20000.3));
//        people.add(new Manager("Supap" ,"Praikaeo" , 50 , "M001" , "IT Manager", 2000000 , "Technology"));
//
//        System.out.println("--- Demonstrating Polymorphism ---");
//
//        for (Person person : people) {
//
//            person.introduce();// Java จะเลือกเวอร์ชันที่ถูกต้องของ introduce() ให้เอง
//            System.out.println(person);
//            System.out.println("--------------------");
//        }

        List<Payable> payables = new ArrayList<>();

        payables.add(new Employee("Thananya" , "Sriwichain" , 35 , "E001" , "Event" , 20000.3));

        payables.add(new Manager("Supap" ,"Praikaeo" , 50 , "M001" , "IT Manager", 305000 , "Technology"));

        payables.add(new Consultant("name" , 300 , 40));

        double totalPayout = 0;
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        System.out.println("--- Company Payout Report ---");

        for (Payable entity : payables) {
            double pay = entity.calculatePay();
            totalPayout += pay;

            if (entity instanceof Employee) {
                Employee emp = (Employee) entity;
                System.out.println("Paying Employee " + emp.getFirstName() + ": " + currencyFormatter.format(pay));
            }else if (entity instanceof Consultant) {
                Consultant con  = (Consultant) entity;
                System.out.println("Paying Consultant " + con.getName() + ": " + currencyFormatter.format(pay));
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Total Payout This Period: " + currencyFormatter.format(totalPayout));

    }


}