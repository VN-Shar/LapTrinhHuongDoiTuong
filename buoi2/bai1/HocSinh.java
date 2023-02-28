// Khai báo package(gói)
package buoi2.bai1;

// Khai báo lib (thư viện) 
import java.util.Scanner;

// Khai báo tên class(lớp)
public class HocSinh {
    // Các biến của lớp
    private String maSV;
    private String ten;
    private float dtbSV;

    // Các hàm của lớp
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTenSV() {
        return ten;
    }

    public void setHoTenSV(String ten) {
        this.ten = ten;
    }

    public float getDtbSV() {
        return dtbSV;
    }

    public void setDtbSV(float dtbSV) {
        this.dtbSV = dtbSV;
    }

    public void input(Scanner sc) {

        sc.nextLine();
        System.out.print("Nhap vao ma SV: ");
        this.maSV = sc.nextLine();

        System.out.print("Nhap vao ho ten: ");
        this.ten = sc.nextLine();

        System.out.print("nhap vao diem sv: ");
        this.dtbSV = sc.nextFloat();
    }

    public void output() {
        System.out.println("Ma sinh vien: " + maSV + "\nHo ten: " + ten + "\nDiem trung binh: " + dtbSV);
    }
}
