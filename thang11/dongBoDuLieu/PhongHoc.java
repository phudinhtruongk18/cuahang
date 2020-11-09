package thang11.dongBoDuLieu;

public class PhongHoc{
    public void suDungPhong(int thoiGianMuon,String nguoiMuonPhong) {
        synchronized (this) {
            System.out.println("Phòng Học Đang Được Sử Dụng bởi"+nguoiMuonPhong+"\t");
            try {
                Thread.sleep(thoiGianMuon);
            } catch (Exception e) {
                System.out.println("Thread bi lỗi");
            }
            System.out.println("\nPhòng Học Đang Trống");
        }
    }

    public static void main(String[] args) {
        PhongHoc a1 = new PhongHoc();
        a1.suDungPhong(5055,"Phú");
        a1.suDungPhong(4001,"Phú 2");
        a1.suDungPhong(2003,"Phú 3");
    }
}
