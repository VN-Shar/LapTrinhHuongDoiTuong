package buoi3.bai3;

import java.util.ArrayList;

import buoi3.bai1_2.HangDienMay;
import buoi3.bai1_2.HangThucPham;
import buoi3.bai1_2.HangHoa;

public class DanhSachHangHoa {

    private ArrayList<HangHoa> danhSachHangHoa = new ArrayList<>();

    public void themMatHang(HangHoa hangHoa) {
        danhSachHangHoa.add(hangHoa);
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
