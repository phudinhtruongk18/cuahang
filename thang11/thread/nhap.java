package thang11.thread;

import java.util.Scanner;

public class nhap extends Thread {
    public String input = " ";
    public boolean flagPause = false;

    @Override
    public void run() {
        Scanner cin = new Scanner(System.in);
        input = cin.nextLine();
        if (input.equals(" ")) {
            flagPause = !flagPause;
            if(flagPause)
                System.out.println("Ban da bam space de pause");
            if (!flagPause) {
                System.out.println("Ban da bam space de play");

            }
        }

    }
}
