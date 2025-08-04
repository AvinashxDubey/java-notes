package org.javagenesis.threading;

public class Threading implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Threading());
        thread.start();
    }
}



