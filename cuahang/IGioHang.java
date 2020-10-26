package cuahang;

import java.io.IOException;

public interface IGioHang {
    double tongTien();
    void them(SanPham temp,int sLuong);
    void xoaAll();
    void hienThi();
    SanPham tim(int ma);
    int soMatHang();
    int soSanPham();
    void inGioHang() throws IOException;
}