package org.tnsif.sf.c2tc.multi_threading;

class Eclipse1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Eclipse id " + Thread.currentThread().getId());
        }
    }
}

public class ImplementsRunnable {
    public static void main(String[] args) {
        Eclipse1 obj = new Eclipse1();          // your Runnable object
        Thread t1 = new Thread(obj);            // ✅ pass obj into Thread
        t1.start();                             // starts a new thread
    }
}
