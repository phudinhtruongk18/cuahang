package thang11.thread;

public class in extends Thread{
    private boolean check;
    private String trangThai="video da bat dau chay";

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(trangThai);
            Thread.sleep(1000);
            System.out.println(trangThai);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    void updateCheck(boolean temp){
        check = temp;
        if (check) trangThai="video da tam dung";
            else trangThai="video is playing";
    }
public static void main(String[] args) {
    in xuatRa = new in();
    nhap nhapVao = new nhap();

    do{
    xuatRa.run();
    nhapVao.run();
    xuatRa.updateCheck(nhapVao.flagPause);
    }
    while(true);
}
}


