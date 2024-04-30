package Designs.abstract_design_pattern;

public class Clint {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndroidDevFactory());
        System.out.println(e1.name());
        System.out.println(e1.sarary());
    }
}
