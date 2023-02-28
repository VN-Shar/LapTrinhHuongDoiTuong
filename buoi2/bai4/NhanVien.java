package buoi2.bai4;

import java.util.Scanner;

public class NhanVien {

    private String maSo, hoTen;
    private float hsl;

    private static float luongTrungBinh;
    private static int soLuongNhanVien = 0;

    public NhanVien() {
        this(null, null, 0);
    }

    public NhanVien(NhanVien nv) {
        this.hoTen = nv.hoTen;
        this.maSo = nv.maSo;
        this.hsl = nv.hsl;
    }

    public NhanVien(String maSo, String hoTen, float hsl) {

        soLuongNhanVien++;
    }

    public void nhapNhanVien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ma: ");
        maSo = scanner.nextLine();

        System.out.print("Nhap ten: ");
        hoTen = scanner.nextLine();

        System.out.println("Luong trung binh: ");
        hsl = scanner.nextFloat();

        scanner.close();
    }

    public String getMaSo() {
        return this.maSo;
    }

    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return this.hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getHsl() {
        return this.hsl;
    }

    public void setHsl(float hsl) {
        this.hsl = hsl;
    }

    public float tinhLuong() {
        return luongTrungBinh * hsl;
    }

    public static void nhapLuongTrungBinh() {
        System.out.print("Nhap luong trung binh: ");
        Scanner scanner = new Scanner(System.in);
        luongTrungBinh = scanner.nextFloat();
        scanner.close();
    }

    public static void inSoLuongNhanVien() {
        System.out.println("So luong nhan vien: " + soLuongNhanVien);
    }

    @Override
    public String toString() {
        return "Ma so: " + maSo + "\nHo ten: " + hoTen + "\nHe so luong: " + hsl;
    }
}
