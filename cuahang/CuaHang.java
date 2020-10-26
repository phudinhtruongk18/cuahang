package cuahang;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CuaHang extends ArrayList<SanPham> {
    private final String name;
    HashMap<String,String> tongHopDanhGia = new LinkedHashMap<>();
    HashMap<KhachHang,Double> danhSachThanhVien = new LinkedHashMap<>();

    public CuaHang(String tempName){
        name = tempName;
    }

    public void themSanPham(SanPham temp,int sl) {
        if(sl>=0){SanPham kq = this.tim(temp.getMa());//kiem tra co trung bang pp khac
        if (kq==null){
            temp.setSoLuong(sl);
            add(temp);
        }
        else {
            kq.setSoLuong(kq.getSoluong()+sl);
        }}else System.out.println("Số lượng âm không thể thêm vào cửa hàng");
    }

//    public void xoaCuaHang(){           //xu dung truong hop nay khi khong kinh doanh nua
//        clear();
//        System.out.println("Da xoa toan bo gio hang");
//    }
    public void hienThi(){
        if (isEmpty()) System.out.println("Cửa hàng không có bất cứ mặt hàng nào");
        System.out.println("Cửa Hàng "+name+" có "+soMatHang()+" mặt hàng");
        System.out.println("Cửa Hàng "+name+" có "+soSanPham()+" sản phẩm");
        for (SanPham i : this)
            System.out.println(i);
    }

    public SanPham tim(int temp){
        for (SanPham s:this) {
            if (s.getMa().equals(temp))//??
                return s;
        }
        return null;
    }

    public int soMatHang() {
        int tam=0;
        for (SanPham ignored : this)
            tam++;
        return tam;
    }

    public int soSanPham() {
        int tam=0;
        for (SanPham i : this)
            tam+=i.getSoluong();
        return tam;
    }

    @Override
    public String toString() {
        StringBuilder kq= new StringBuilder(" ");
        if (isEmpty()) System.out.println("Cửa hàng không chứa bất kì sản phẩm nào");
        for (SanPham i : this )
            kq.append(i);
        return kq.toString();
    }
    public void hienThiDanhGia() {
        tongHopDanhGia.forEach((sanPham, danhGia) -> System.out.println("Đánh giá \n"+sanPham+":"+danhGia));
    }
    public void thuThap(String tenSP,String voteSP) {
        tongHopDanhGia.put(tenSP,voteSP);
    }

    public void themThanhVien(KhachHang khachHang) {
    danhSachThanhVien.put(khachHang,khachHang.khuyenMai);
    }
    public void thongBaoKhuyenMai(double tempPri) {
        danhSachThanhVien.forEach((khachHang, tienKH) -> {
            if (tienKH>=tempPri)khachHang.phanHoi();});
    }

    public String getName() {
        return name;
    }
}
