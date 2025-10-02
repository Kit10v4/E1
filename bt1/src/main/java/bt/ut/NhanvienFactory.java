package bt.ut;

public class NhanvienFactory implements INhanvienFactory{
    @Override
    public Nhanvien createNhanvien(String loaiNV, String maso, String hoten, double luongCB) {
        Nhanvien nv;
        switch (loaiNV) {
            case "KLTV":
                nv = new Laptrinhvien(maso, hoten, luongCB);
                break;
            case "CVPT":
                nv = new ChuyenvienPhantich(maso, hoten, luongCB);
                break;
            case "KTV":
                nv = new Ketoanvien(maso, hoten, luongCB);
                break;  
            default:
                return null;
        }
        return nv;
    }

    @Override
    public Nhanvien createNhanvien(String loaiNV) {
        Nhanvien nv;
        switch (loaiNV) {
            case "KTV":
                nv = new Laptrinhvien();
                break;
            case "KTVP":
                nv = new ChuyenvienPhantich();
                break;
            case "KTVT":
                nv = new Ketoanvien();
                break;
            default:
                return null;
        }
        return nv;
    }
}
