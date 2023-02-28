package buoi2.bai4;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("111", "2343", 1);
        NhanVien nv3 = new NhanVien();
        nv3.nhapNhanVien(scanner);

        scanner.nextLine();
        System.out.print("Nhap ten: ");
        nv1.setHoTen(scanner.nextLine());

        scanner.close();

        float max = nv1.getHsl();
        NhanVien nv = new NhanVien(nv1);

        if (nv2.getHsl() > max) {
            max = nv2.getHsl();
            nv = nv2;
        }

        if (nv3.getHsl() > max) {
            max = nv3.getHsl();
            nv = nv3;
        }

        System.out.println("Nhan vien co he so luong max: " + nv);
    }
}
