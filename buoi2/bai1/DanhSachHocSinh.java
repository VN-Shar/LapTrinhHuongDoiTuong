package buoi2.bai1;

import java.util.Scanner;

public class DanhSachHocSinh {

    private HocSinh ds[];

    public void nhapDanhSach() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong hoc sinh: ");
        int soLuong = scanner.nextInt();

        ds = new HocSinh[soLuong];

        for (int i = 0; i < soLuong; i++) {
            ds[i] = new HocSinh();
            System.out.println("\nNhap sinh vien thu " + (i + 1));
            ds[i].input(scanner);
        }

        scanner.close();
    }

    public void xuatDanhSach() {
        System.out.println("\nDanh sach hoc sinh");
        for (int i = 0; i < ds.length; i++) {
            ds[i].output();
            System.out.println("------------------------------------");
        }
    }

    public void sapXep() {
        HocSinh temp;
        for (int i = 0; i < ds.length - 1; i++) {
            for (int j = i + 1; j < ds.length; j++) {
                if (ds[i].getDtbSV() < ds[j].getDtbSV()) {
                    temp = ds[i];
                    ds[i] = ds[j];
                    ds[j] = temp;
                }
            }
        }
    }
}
