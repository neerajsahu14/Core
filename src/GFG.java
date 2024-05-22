import java.lang.reflect.Method;

/**
 *  
 */
class Check {
    private void private_mathod() {
        System.out.println("private Method " + "call from out side");
    }

    public void getprivateMathod() {
        private_mathod();
    }
}

public class GFG {
    public static void main(String[] args) throws Exception {
        Check c = new Check();
        c.getprivateMathod();
        Method m = Check.class.getDeclaredMethod("private_mathod");
        m.setAccessible(true);
        m.invoke(c);
    }
}
