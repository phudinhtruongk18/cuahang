package thang11.dongBoDuLieu;

public class PhongHocVer2{
    public void send(int thoiGianMuon,String nguoiMuonPhong) {
        System.out.println("Phòng Học Đang Được Sử Dụng bởi "+nguoiMuonPhong+"\t");
        try {
            Thread.sleep(thoiGianMuon);
        } catch (Exception e) {
            System.out.println("Thread bi lỗi");
        }
        System.out.println("\nPhòng Học Đang Trống");
    }
    public static void main(String[] args) {
        // Class for send a message using Threads
        PhongHocVer2 ThucHanh1 = new PhongHocVer2();
        ThreadedSend S1 =
                new ThreadedSend(5000,"Phú",ThucHanh1);
        ThreadedSend S2 =
                new ThreadedSend(6000,"Phú nhưng thứ 2",ThucHanh1);

        // Start two threads of ThreadedSend type
        S1.start();
        S2.start();

        // wait for threads to end
        try {
            S1.join();
            S2.join();
        } catch (Exception e) {
            System.out.println("Interrupted");
        }

    }

// Driver class

}



