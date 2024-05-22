package Threads;

public class Consumers extends Thread {
    Company c;

    Consumers(Company c) {
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
            this.c.consume_item();
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
            }
        }
    }
}
