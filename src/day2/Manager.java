package day2;

public class Manager extends Employee{
    private String department;

    public Manager( String firstName, String lastName, int age, String employeeId, String position , String department) {
        super(firstName , lastName , age ,  employeeId , position );
        this.department = department;
    }

    @Override
    public void introduce() {
        super.introduce();

        System.out.println("My department is : " + department);
    }
}
