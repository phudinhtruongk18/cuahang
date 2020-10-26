package cuahang;

import java.util.Scanner;

public class KhachHang extends User {

    public double khuyenMai;
    GioHang gioHangCuaTui= new GioHang();

    public KhachHang(String tempID, String tempPass, String tempName,double tempK) {
        super(tempID,tempPass,tempName);
        khuyenMai = tempK;
    }

    public void buy(CuaHang temp){
        for ( SanPham ignored : gioHangCuaTui) {
            System.out.println("vui long danh gia san pham "+ ignored.getTen() );
            Scanner cin = new Scanner(System.in);
            String danhGia = cin.nextLine();
            temp.thuThap(ignored.getTen(),danhGia);
        }
        gioHangCuaTui.clear();
    }
    @Override
    public boolean equals(User tempObj) {
        return ((id.equals(tempObj.id)) &&
                (this.pass.equals(tempObj.pass)));
    }
    //sử dụng để đăng nhập sau này
    public void dangKy(CuaHang temp){
        System.out.println("Cảm ơn bạn đã đăng kì làm thành viên của "+temp.getName());
        System.out.println("Vui lòng chọn mức giá !");
        System.out.println("Dể khi có khuyến mãi chÚng tôi sẽ thông báo cho bạn!");
        Scanner cin = new Scanner(System.in);
        khuyenMai = cin.nextInt();
        temp.themThanhVien(this);
    }

    @Override
    public String toString() {
        return "KháchHàng{" +name;
    }

    public void phanHoi() {
        System.out.println("Phản hồi từ khách hàng :"+name);
        System.out.println(" 'tôi cần thêm thời gian để suy nghĩ'");
    }
}

