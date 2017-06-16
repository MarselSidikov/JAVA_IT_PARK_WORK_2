package ru.itis.threads;


public class Main {
    public static boolean isHenWin = false;

    public static void main(String[] args) throws Exception {
        String mainThreadName = Thread.currentThread().getName();
        System.out.println(mainThreadName);
        MyThread hen = new MyThread("КУРИЦА");
        MyThread egg = new MyThread("ЯЙЦО");
        hen.setPriority(5);
        egg.setPriority(5);
        hen.start();
        egg.start();

        hen.join();
        egg.join();

        if (isHenWin) {
            System.out.println("ПОБЕДИЛА КУРИЦА");
        } else {
            System.out.println("ПОБЕДИЛО ЯЙЦО");
        }
    }
}
