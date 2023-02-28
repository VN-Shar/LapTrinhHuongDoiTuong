package buoi2.bai2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhanSo ps1 = new PhanSo();
        System.out.println("Phan so 1: " + ps1);

        ps1.nhapPhanSo(scanner);
        System.out.println("Phan so 1: " + ps1);

        PhanSo ps2 = new PhanSo(4, 16);
        System.out.println(ps2);

        System.out.print("Nhap phan so: ");
        PhanSo ps3 = new PhanSo(scanner.nextInt(), scanner.nextInt());

        System.out.println(ps1.cong(ps3).rutGon());

        System.out.println(new PhanSo(ps1).nhan(ps2).rutGon());

        scanner.close();
    }
}
