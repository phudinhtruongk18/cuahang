package thang11.thread;

public class in implements Runnable{
    private String trangThai="enter de bat dau xem clip ";

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            System.out.println(trangThai);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        run();
    }
    void updateCheck(boolean temp){
        if (temp) trangThai="video da tam dung";
            else trangThai="video is playing";
    }
public static void main(String[] args) {
    in xuatRa = new in();
    nhap nhapVao = new nhap();

    do{
    xuatRa.run();
    nhapVao.run(

    );
    //ban se nhap vao cac ki tu de kiem tra
    //neu nhap vao space thi se thay doi flagPause
    xuatRa.updateCheck(nhapVao.flagPause);
    }
    while(true);
}
}
