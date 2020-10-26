package cuahang;

public class Main {
    public static void main(String[] args) {
        SanPham b = new SanPham(1,"Degree",20.25);
        SanPham c = new SanPham(2,"H&M",248.56);
        SanPham d = new SanPham(3,"mcQueen",28.56);
        //tạo sản phẩm
        CuaHang phuStore = new CuaHang("Phu's store");
        //tạo cửa hàng
        phuStore.themSanPham(b,-2);
        //cố tình nhập số âm để kiểm tra
        phuStore.themSanPham(b,2);
        phuStore.themSanPham(c,3);
        phuStore.themSanPham(d,5);
        //tạo sản phậm trong cửa hàng
        phuStore.hienThi();
        //hiển thị cửa hàng
        KhachHang obama = new KhachHang("1","2","phu",5);
        //tạo khách hàng
        obama.gioHangCuaTui.them(phuStore.tim(2),2);
        //tìm kiếm sản phầm với ID và thêm vào id của khách hàng
        obama.gioHangCuaTui.hienThi();
        //hiển thị giỏ hàng của khách hàng
        obama.buy(phuStore);
        //mua toàn bộ giỏ hàng và clear giỏ hàng
        //khi mua thì khách hàng sẽ được đánh giá từng sản phẩm
        obama.dangKy(phuStore);
        //khách hàng đăng kí làm thành viên
        phuStore.hienThiDanhGia();
        //cửa hàng hiển thị tất cả sản phầm và đánh giá của các sản phẩm
        phuStore.thongBaoKhuyenMai(5);
        //thông báo đến những khách hàng trong danh sách thành viên
        //nếu K > 5 (số tiền sự kiện khuyến mãi)
    }
}
