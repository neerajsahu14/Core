package abstract_design_pattern;


public class AndroidDevFactory extends EmployeeAbstractFactory{
    public Employee creatEmployee() {
        return new AndroindDevloper();
   }
}
