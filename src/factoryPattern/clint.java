package factoryPattern;

public class clint { 
    public static void main(String[] args) {

        Employee e1 = EmployeeFactory.getEmployee("ANDROID DEVLOPER");
        Employee e2 = EmployeeFactory.getEmployee("WEB DEVLOPER");
        System.out.println(e1.salary());
        System.out.println(e2.salary());
    }
}
