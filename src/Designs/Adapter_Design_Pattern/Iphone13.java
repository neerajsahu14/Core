package Designs.Adapter_Design_Pattern;

public class Iphone13 {
    private AppleCharger appleCharger;

    public Iphone13(AppleCharger appleCharger) {
        this.appleCharger = appleCharger;
    }

     
    public void ChargeIphone(){
            appleCharger.Chargephone();
    }
}