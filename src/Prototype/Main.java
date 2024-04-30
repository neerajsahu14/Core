package Prototype;

public class Main implements Cloneable {
    public static void main(String[] args) throws Exception, CloneNotSupportedException {
        NetworkConnection n1 = new NetworkConnection();
        n1.setIp("127.0.0.1");
        n1.LoadImportantData();
        System.out.println(n1);
        try {
            NetworkConnection n2 = (NetworkConnection) n1.clone();
            System.out.println(n2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
