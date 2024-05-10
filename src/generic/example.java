package generic;
import java.util.*;
public class example {
    public static void main(String[] args) {
        Box<String> box = new Box<String>("hello");
        System.out.println(box.getValue());
        System.out.println(box.container.getClass().getName());
        Box<Integer> box2 = new Box<Integer>(123);
         System.out.println(box2.getValue());
         System.out.println(box2.container.getClass().getName());
         box.container = "hi";
         
    }

}