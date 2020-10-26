package cuahang;


public class SanPham {
    private final int ma;
    private final String ten;
    private final double gia;
    private int SoLuong;

    public SanPham(int i, String degree, double i2) {
        this.ma = i;
        this.ten = degree;
        this.gia = i2;
    }

    public double getGia() {
        return gia;
    }

    public Integer getMa() {//tai sao lai dung integer
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setSoLuong(int sl) {
        this.SoLuong = sl;
    }

    @Override
    public String toString() {
        return "SảnPhẩm{" +
                "mã=" + ma +
                ", tên='" + ten + '\'' +
                ", giá=" + gia +
                ", SốLượng=" + SoLuong +
                '}';
    }
    public int getSoluong() {
        return SoLuong;
    }
    }
