package Annotation_and_Lombok;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Василий", 78000, new Date());

        System.out.println(employee);
    }
}
