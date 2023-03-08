package buoi3.bai1_2;

import java.util.Scanner;

public class HangHoa {

    protected String maHang, tenHang;
    protected long gia;

    public HangHoa() {

    }

    public HangHoa(String maHang, String tenHang, long gia) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.gia = gia;
    }

    public void nhap(Scanner scanner) {
        System.out.print("Nhap ma hang hoa: ");
        scanner.nextLine();
        this.maHang = scanner.nextLine();

        System.out.print("Nhap ten hang hoa: ");
        this.tenHang = scanner.nextLine();

        System.out.print("Nhap gia hang hoa: ");
        this.gia = scanner.nextLong();
    }

    public void xuat() {
        System.out.println("Ma: " + maHang + ", Ten: " + tenHang + ", Gia" + gia);
    }

}
