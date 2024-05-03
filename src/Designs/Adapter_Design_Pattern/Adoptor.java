package Designs.Adapter_Design_Pattern;

public class Adoptor implements AppleCharger {
    private AndroidCharger charger;

    public Adoptor(AndroidCharger charger) {
        this.charger = charger;
    }

    @Override
    public void Chargephone() {
        charger.chargeAndroidPhone();
        System.out.println("you phone is charging with Adoptor");
    }

}
