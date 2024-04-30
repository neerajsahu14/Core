package Designs.ObsrverPattern;
public class Subscriber implements Observer {
    String name;

    Subscriber(String name) {
           this.name = name;
    }

    @Override
    public void notified() {
        System.out.println("New video uploded "+ name+": Notification");
        
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
