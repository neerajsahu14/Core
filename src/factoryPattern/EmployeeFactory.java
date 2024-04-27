package factoryPattern;

public class EmployeeFactory {
    // get the name of the employee
    public static Employee getEmployee(String emplType) {
        if (emplType.trim().equalsIgnoreCase("ANDROID DEVLOPER")) {
            return new AndroidDevloper();
        }
        else if (emplType.trim().equalsIgnoreCase("WEB DEVLOPER")) {
            return new webDevloper();
        }
        else
            return null;
    }
     
}
