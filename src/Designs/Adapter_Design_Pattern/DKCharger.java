package Designs.Adapter_Design_Pattern;

public class DKCharger implements AndroidCharger {

    @Override
    public void chargeAndroidPhone() {
        System.out.println(" your Android phone is charging ");
    }
}