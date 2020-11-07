package thang11.thread;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class nhap extends Thread {
    public String input = " ";
    public boolean flagPause = false;

    @Override
    public void run() {
        Scanner cin = new Scanner(System.in);
        try {
            Robot robot = new Robot();
            System.out.println("wait...");
            input = cin.nextLine();
            Thread.sleep(1000);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (InterruptedException | AWTException e) {
            e.printStackTrace();
        }
        if (input.equals(" ")) {
            flagPause = !flagPause;
            if (flagPause)
                System.out.println("Ban da bam space de pause");
            if (!flagPause) {
                System.out.println("Ban da bam space de play");
            }
        }

    }
}

