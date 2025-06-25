package day2;

import java.util.Scanner;

public class Person {
    // 1. Attributes (คุณลักษณะ) - ทำให้เป็น private เพื่อ Encapsulation
    private String fristName;
    private String lastName;
    private int age;

    // 2. Constructor (ผู้สร้าง) - ใช้สำหรับรับค่าเริ่มต้นเมื่อสร้าง Object
    public Person(String fristName, String lastName, int age) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return fristName;
    }

    public void setFristName (String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // เราสามารถใส่ logic เพิ่มเติมใน Setter ได้
        if (age > 0) {
            this.age = age;
        }
    }

    // 4. Behavior (พฤติกรรม)
    public void introduce() {
        System.out.println("Hello, my name is " + this.fristName + " " + this.lastName + "." + " My age is :" +this.age);
    }


}
