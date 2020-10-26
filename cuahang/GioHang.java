package cuahang;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GioHang extends ArrayList<SanPham> implements IGioHang {
    public GioHang() {
    }

    public void them(SanPham temp, int sl) {
        if (sl < 0)System.out.println("Không thể mua số lượng nhỏ âm!!!!");
        else {
            SanPham kq = this.tim(temp.getMa());//kiem tra co trung bang pp khac
            if (kq == null) {
                temp.setSoLuong(sl);
                add(temp);
            } else kq.setSoLuong(kq.getSoluong() + sl);

        }
  }

    public void xoaAll() {
        clear();
        System.out.println("Đã xóa toàn bộ giỏ hàng");
    }

    public void hienThi() {
        if (isEmpty()) System.out.println("Giỏ hàng không chứa bất kì sản phảm nào");
        System.out.println("Giỏ hàng có " + soMatHang() + "mặt hàng");
        System.out.println("Giỏ hàng có " + soSanPham() + "sản phẩm");
        for (SanPham i : this)
            System.out.println(i);
    }

    public double tongTien() {
        double tiens = 0.0;
        for (SanPham i : this) {
            tiens += i.getGia() * i.getSoluong();
        }
        return tiens;
    }

    public SanPham tim(int temp) {
        for (SanPham s : this) {
            if (s.getMa().equals(temp))//??
                return s;
        }
        return null;
    }

    @Override
    public int soMatHang() {
        int tam = 0;
        for (SanPham ignored : this)
            tam++;
        return tam;
    }

    @Override
    public int soSanPham() {
        int tam = 0;
        for (SanPham i : this)
            tam += i.getSoluong();
        return tam;
    }

    public void inGioHang() {
        try {
            FileOutputStream fos = new FileOutputStream("xuatfileARRAYLIST.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.toString());
            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Lỗi ghi file: " + ex);
        }
    }
    //in hóa đơn giỏ hàng để phát triển sau này

    @Override
    public String toString() {
        StringBuilder kq = new StringBuilder(" ");
        if (isEmpty()) System.out.println("giỏ hàng không chứa bất kì sản phẩm nào");
        for (SanPham i : this)
            kq.append(i);
        return kq.toString();
    }

}