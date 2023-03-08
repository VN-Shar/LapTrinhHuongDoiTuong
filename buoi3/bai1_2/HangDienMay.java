package buoi3.bai1_2;

import java.time.LocalDate;
import java.util.Scanner;

public class HangDienMay extends HangHoa {

    private LocalDate thoiGianBaoHanh;
    private float dienAp;
    private float congSuat;

    public HangDienMay() {

    }

    public HangDienMay(LocalDate thoiGianBaoHanh, float dienAp, float congSuat) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.congSuat = congSuat;
        this.dienAp = dienAp;
    }

    public void nhap(Scanner scanner) {

        super.nhap(scanner);

        System.out.println("Nhap thoi gian bao hanh: ");
        System.out.print("\tNhap ngay: ");
        int ngay = nhap(scanner, 1, 31);
        System.out.print("\tNhap thang: ");
        int thang = nhap(scanner, 1, 12);
        System.out.print("\tNhap nam: ");
        int nam = nhap(scanner, 0, 9999);

        this.thoiGianBaoHanh = LocalDate.of(nam, thang, ngay);

        System.out.print("Nhap dien ap: ");
        this.dienAp = scanner.nextFloat();

        System.out.print("Nhap cong suat: ");
        this.congSuat = scanner.nextFloat();
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
                "Thoi gian bao hanh: " + thoiGianBaoHanh + ", dien ap: " + dienAp + ", cong suat: " + congSuat);
    }

}
