package LembdaExpretion;

public class Main {
    public static void main(String[] args) {
        System.out.println("My System started...");
        // Myintr myinterimpl = new Myinterimpl();
        // myinterimpl.seyHello();
        Myintr i = new Myintr() {
            @Override
            public void sayHello() {
                System.out.println("this is first anonymous class");
            }
        };
        i.sayHello();
        Myintr i2 = () -> System.out.println("using lamda function");
        i2.sayHello();
       LengthInter l=s-> s.length();
        System.out.println(l.getlength("hello"));
    }
}
