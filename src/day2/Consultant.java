package day2;

public class Consultant implements Payable{
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    public Consultant(String name, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    @Override
    public double calculatePay() {
//        System.out.println(this.hourlyRate * this.hoursWorked);
       return this.hourlyRate * this.hoursWorked;
    }
}
