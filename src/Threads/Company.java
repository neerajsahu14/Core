package Threads;

public class Company {
    private int n;
    boolean f = false;

    public synchronized void produce_item(int n) {
        if(f){
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("producing:" + n);
        this.n = n;
        notify();
        f = true;
    }

    public synchronized int consume_item() {
        if (!f) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("consuming : " + this.n);
        f = false;
        notify();
        return this.n;
    }
}
