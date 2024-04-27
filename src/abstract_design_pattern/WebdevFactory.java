package abstract_design_pattern;

public class WebdevFactory extends EmployeeAbstractFactory {
    public Employee creatEmployee() {
        return new WeDevlpor();
    }
}
