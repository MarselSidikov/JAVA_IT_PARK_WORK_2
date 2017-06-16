package ru.itis.threads;

public class MyThread extends Thread {
    private String message;

    public MyThread(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread() + " " + message);
            Main.isHenWin = this.message.equals("КУРИЦА");
            if (Main.isHenWin) {
                System.out.println("КУРИЦА ТО ПОБЕДИЛА");
            } else {
                System.out.println("ЯЙЦО ВПЕРЕД!");
            }
        }
    }
}
