package buoi3.bai1_2;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        DanhSachHangHoa danhSach = new DanhSachHangHoa();
        Scanner scanner = new Scanner(System.in);
        HangHoa hangHoa;

        byte lenh, loai;
        do {

            System.out.println("\n1: Them mot mat hang vao danh sach");
            System.out.println("2: Xuat mat hang theo loai");
            System.out.println("0: Thoat chuong trinh");

            System.out.print("\nNhap lenh: ");
            lenh = scanner.nextByte();

            switch (lenh) {

                case 0:
                    lenh = 0;
                    break;

                case 1:
                    System.out.print("Nhap loai mat hang: ");
                    loai = scanner.nextByte();

                    if (loai == 0) {
                        hangHoa = new HangDienMay();
                        hangHoa.nhap(scanner);
                    } else {
                        hangHoa = new HangThucPham();
                        hangHoa.nhap(scanner);
                    }
                    danhSach.themMatHang(hangHoa);
                    break;

                case 2:
                    System.out.print("Nhap loai mat hang: ");
                    loai = scanner.nextByte();
                    danhSach.xuatDanhSachTheoLoai(loai);
                    break;

                default:
                    System.out.println("Lenh khong hop le");
                    break;
            }

        } while (lenh != 0);

        scanner.close();
    }
}
