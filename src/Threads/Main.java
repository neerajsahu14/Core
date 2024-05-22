package Threads;

public class Main {
    public static void main(String[] args) {
        // MyThread myThread = new MyThread();
        // Thread thr = new Thread(myThread);
        // MyThread2 thr2 = new MyThread2();
        // thr2.start();
        // thr.start();
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumers c = new Consumers(comp);
        p.start();
        c.start();
    }
}
