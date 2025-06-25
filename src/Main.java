import java.util.Scanner;
import day2.Person;
import day2.BankAccount;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // สร้าง Object (บ้านหลังแรก) จาก Class Person
        Person person1 = new Person("Tony", "Stark", 50);

        // สร้าง Object (บ้านหลังที่สอง) จากพิมพ์เขียวเดียวกัน
        Person person2 = new Person("Peter", "Parker", 22);

        // เรียกใช้พฤติกรรมของแต่ละ Object
        System.out.println("--- Person 1 ---");
        person1.introduce(); // แสดงผล: Hello, my name is Tony Stark.

        // เรียกใช้ Getter เพื่อดึงข้อมูล
        System.out.println("First name: " + person1.getFirstName()); // แสดงผล: First name: Tony

        System.out.println("\n--- Person 2 ---");
        person2.introduce(); // แสดงผล: Hello, my name is Peter Parker.
        System.out.println(person2.getFirstName() + "'s age is " + person2.getAge()); // แสดงผล: Peter's age is 22

        // ลองใช้ Setter เพื่อเปลี่ยนค่า
        System.out.println("\nSpider-Man gets a new name...");
        person2.setLastName("Stark-Parker");
        person2.introduce(); // แสดงผล: Hello, my name is Peter Stark-Parker.

        // เรียกใช้พฤติกรรมของแต่ละ Object
        System.out.println("---Person1---");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Last Name: ");
        String lastName = input2.nextLine();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = input3.nextInt();

        Person person3 = new Person(firstName ,lastName , age);
        person3.introduce();
        BankAccount bankAccount = new BankAccount("39485329" , "Evolazman" , 0);
        bankAccount.deposit(50000);
        bankAccount.withdraw(5500);
    }


}