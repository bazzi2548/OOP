package org.example;

public class Main extends Thread{
    static int share;
    public static void main(String[] args) {
        Main main1 = new Main();
        Main main2 = new Main();

        main1.start();
        main2.start();
    }

    public void run(){
        for (int cnt = 0; cnt < 10; cnt++) {
            System.out.println(share++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}