package thang11;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

//khong nhat thiet
//mot cai nghe ma mot cai phat
// khi nghe thi neu bam space thi se dung lai
public class Cach1 extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " is running thread cach1");
    }

    public static void main(String[] args) {
        Cach1 temp2 = new Cach1();
        Thread temp = new Cach1();

        temp.run();
        temp2.run();

    }

    class MKeyListener extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent event) {

            char ch = event.getKeyChar();

            if (ch == 'q') {

                System.out.println("thoat chuong trinh");

            }
        }
    }
}
