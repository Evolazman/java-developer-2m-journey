package day2;

public class Employee extends Person {
    // Attributes เพิ่มเติมเฉพาะของ Employee
    private String employeeId;
    private String position;

    // Constructor ของ Employee
    public Employee(String firstName, String lastName, int age, String employeeId, String position) {
        // คำสั่งแรกสุด! ต้องเรียก constructor ของคลาสแม่ (Person)
        // เพื่อตั้งค่า firstName, lastName, และ age
        super(firstName, lastName, age);

        // จากนั้นค่อยตั้งค่า attributes ของ Employee เอง
        this.employeeId = employeeId;
        this.position = position;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    // 2. Method Overriding: เขียนทับเมธอด introduce()
    @Override
    public void introduce() {
        // เรียกใช้ introduce() ของ Person ก่อน ด้วย super
        super.introduce(); // จะแสดงผล "Hello, my name is [ชื่อ] [นามสกุล]."
        // แล้วค่อยเพิ่มข้อมูลเฉพาะของ Employee เข้าไป
        System.out.println("I am a " + this.position + " with ID: " + this.employeeId);
    }

}
