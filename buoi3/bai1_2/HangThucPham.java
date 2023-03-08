package buoi3.bai1_2;

import java.time.LocalDate;
import java.util.Scanner;

public class HangThucPham extends HangHoa {

    private LocalDate ngaySanXuat, ngayHetHan;

    public HangThucPham() {

    }

    public HangThucPham(LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public void nhap(Scanner scanner) {

        super.nhap(scanner);

        System.out.println("Nhap ngay san xuat: ");
        System.out.print("\tNhap ngay: ");
        int ngay = nhap(scanner, 1, 31);
        System.out.print("\tNhap thang: ");
        int thang = nhap(scanner, 1, 12);
        System.out.print("\tNhap nam: ");
        int nam = nhap(scanner, 0, 9999);

        this.ngaySanXuat = LocalDate.of(nam, thang, ngay);

        System.out.println("Nhap ngay het han:");
        System.out.print("\tNhap ngay: ");
        ngay = nhap(scanner, 1, 31);
        System.out.print("\tNhap thang: ");
        thang = nhap(scanner, 1, 12);
        System.out.print("\tNhap nam: ");
        nam = nhap(scanner, 0, 9999);

        this.ngayHetHan = LocalDate.of(nam, thang, ngay);

    }

    private int nhap(Scanner scanner, int start, int end) {
        int i;
        do {
            i = scanner.nextInt();
        } while (i < start && i > end);
        return i;
    }

    public void xuat() {
        super.xuat();
        System.out.println(
                "Ngay san xuat: " + ngaySanXuat + ", ngay het han: " + ngayHetHan);
    }

}
