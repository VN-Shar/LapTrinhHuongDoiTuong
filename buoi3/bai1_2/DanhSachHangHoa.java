package buoi3.bai1_2;

public class DanhSachHangHoa {

    private HangHoa[] danhSachHangHoa = new HangHoa[100];
    private int soLuong = 0;

    public void themMatHang(HangHoa hangHoa) {
        danhSachHangHoa[soLuong] = hangHoa;
        soLuong++;
    }

    // public void xuatDanhSachTheoLoai(byte maLoai) {
    // switch (maLoai) {
    // case 1:
    // xuatDanhSachTheoLoai(HangThucPham.class);
    // break;

    // case 2:
    // xuatDanhSachTheoLoai(HangDienMay.class);
    // break;
    // }
    // }

    // public <T> void xuatDanhSachTheoLoai(Class<T> type) {
    // for (HangHoa hangHoa : danhSachHangHoa) {
    // if (hangHoa.getClass() == type)
    // hangHoa.xuat();
    // }
    // }

    public void xuatDanhSachTheoLoai(byte maLoai) {
        switch (maLoai) {
            case 1:
                for (HangHoa hangHoa : danhSachHangHoa) {
                    if (hangHoa instanceof HangThucPham)
                        hangHoa.xuat();
                }
                break;
            case 2:
                for (HangHoa hangHoa : danhSachHangHoa) {
                    if (hangHoa instanceof HangDienMay)
                        hangHoa.xuat();
                }
                break;

            default:
                System.out.println("Ma mat hang khong hop le");
        }
    }
}
