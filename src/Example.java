public class Example {
    public static void main(String[] args) {
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());
        Samosa s2 = Samosa.getSamosa();
        System.out.println(s2.hashCode());
        Jalebi j1 = Jalebi.getJalebi();
        System.out.println(j1.hashCode());
        Jalebi j2 = Jalebi.getJalebi();
        System.out.println(j2.hashCode());
    }
}
