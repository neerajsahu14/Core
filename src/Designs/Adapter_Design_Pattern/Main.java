package Designs.Adapter_Design_Pattern;

public class Main {
    public static void main(String[] args) {

        System.out.println("Program started");
        AppleCharger charger = new Adoptor(new DKCharger());
        Iphone13 iphone13 = new Iphone13(charger);
        iphone13.ChargeIphone();
    }
}
