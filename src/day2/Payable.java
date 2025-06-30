package day2;

public interface Payable {
    // Interface บอกแค่ว่า "ต้องทำอะไรได้"
    // ไม่ต้องมี public abstract เพราะมันเป็นโดยอัตโนมัติ
    double calculatePay();
}
