package Designs.singltonPattern;
import java.io.Serializable;

public class Samosa implements Serializable,Cloneable{
    private static Samosa samosa;
    private Samosa(){
            if(samosa!=null){
                throw new RuntimeException("your tiying to break singleton pattern");
            }
    }
    public static Samosa getSamosa(){
        if(samosa == null){
            samosa = new Samosa();
        }
        return samosa;
    }
    public Object readResolve(){
        return samosa;
    }
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }
        public Object clone() throws CloneNotSupportedException{
        return samosa;
    }
}
// public enum Samosa{
//     INSTANCE

// }
