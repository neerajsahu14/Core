
import java.io.Serializable;

public class Example implements Serializable {
    public static void main(String[] args) throws Exception, CloneNotSupportedException {
        // Samosa s1 = Samosa.getSamosa();
        // System.out.println(s1.hashCode());
        // Samosa s2 = Samosa.getSamosa();
        // System.out.println(s2.hashCode());
        // Jalebi j1 = Jalebi.getJalebi();
        // System.out.println(j1.hashCode());
        // Jalebi j2 = Jalebi.getJalebi();
        // System.out.println(j2.hashCode());

        // Samosa s1 = Samosa.INSTANCE;
        // System.out.println(s1.hashCode());
        // Constructor<Samosa> constructor= Samosa.class.getDeclaredConstructor();
        // constructor.setAccessible(true);
        // Samosa s2 = constructor.newInstance();
        // System.out.println(s2.hashCode());
        // Samosa s1 = Samosa.getSamosa();
        // System.out.println(s1.hashCode());
        // ObjectOutputStream oos= new ObjectOutputStream ( new
        // FileOutputStream("abc.ob"));
        // oos.writeObject(s1);
        // System.out.println("serialization is done >>>");
        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.ob"));
        // Samosa s2 = (Samosa) ois.readObject();
        // System.out.println(s2.hashCode());
        //
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        Samosa s2 = (Samosa) s1.clone();
        System.out.println(s2.hashCode());
    }
}
