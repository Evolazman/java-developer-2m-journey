package day5;
import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {
//        System.out.println("--- List Example (ArrayList) ---");
//        List<String> friendList = new ArrayList<>();
//        friendList.add("John");
//        friendList.add("Sarah");
//        friendList.add("Jane");
//        friendList.add("Joe");
//        friendList.add("John");
//
//        System.out.println("My friends: " + friendList);
//        System.out.println("Friend at index 1: " + friendList.get(1)); // เข้าถึงด้วย index
//        System.out.println("Number of friends: " + friendList.size());
//
//        System.out.println("\n--- Set Example (HashSet) ---");
//        Set<String> productTags = new HashSet<>();
//        productTags.add("Apple");
//        productTags.add("Banana");
//        productTags.add("Orange");
//        productTags.add("Apple");
//        System.out.println("My productTags: " + productTags);
//        System.out.println("Does it contain 'mobile'? " + productTags.contains("Apple"));
//        System.out.println("Number of unique tags: " + productTags.size());
//
//        System.out.println("\n--- Map Example (HashMap) ---");
//        Map<String , Integer> studentScores = new HashMap<>();
//        studentScores.put("Peter", 85); // Key: "Peter", Value: 85
//        studentScores.put("Jane", 92);
//        studentScores.put("Tony", 77);
//        studentScores.put("Peter", 88); // ใส่ Key ซ้ำ -> ค่าเก่าจะถูกเขียนทับ!
//
//        System.out.println("My studentScores: " + studentScores);
//        System.out.println("Jane's score: " + studentScores.get("Jane"));
//
//        // การวน Loop ใน Map (วิธีที่นิยมที่สุด)
//        System.out.println("\nIterating through the map:");
//        for (Map.Entry<String , Integer> entry : studentScores.entrySet()) {
//            String studentName = entry.getKey();
//            int studentScore = entry.getValue();
//            System.out.println("-----------------" + studentName + "-----------------");
//            System.out.println("Student name: " + studentName);
//            System.out.println("Student score: " + studentScore);
//        }
        List<String> order1 = new ArrayList();
        order1.add("Laptop");
        order1.add("Laptop");
        order1.add("Mouse");
        order1.add("Keyboard");

        List<String> order2 = new ArrayList();
        order2.add("Monitor");
        order2.add("Keyboard");

        List<String> order3 = new ArrayList();
        order3.add("Laptop");
        order3.add("Webcam");

        Map<String , List<String>> orders = new HashMap<>();
        orders.put("ORD001", order1);
        orders.put("ORD002", order2);
        orders.put("ORD003", order3);

        Set<String> uniqueProducts = new HashSet<>();
        Map<String , Integer> productCounts = new HashMap<>();

        for (List<String> order : orders.values()) {
            for (String product : order) {
                productCounts.put(product, productCounts.getOrDefault(product, 0) + 1);
                uniqueProducts.add(product);
            }
        }
        System.out.println("------------- Unique Products (Set) -------------");
        System.out.println(uniqueProducts);

        System.out.println("\n------------- Product Counts (Map) -------------");
        System.out.println(productCounts);

    }
}
