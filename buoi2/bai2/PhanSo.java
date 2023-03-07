package buoi2.bai2;

import java.util.Scanner;

public class PhanSo {

    private int tu, mau;

    public PhanSo() {
        this.mau = 1;
        this.tu = 0;
    }

    public PhanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public PhanSo(PhanSo p) {
        this.tu = p.tu;
        this.mau = p.mau;
    }

    public void nhapPhanSo(Scanner scanner) {

        System.out.print("Nhap tu so: ");

        do {
            this.tu = scanner.nextInt();
        } while (this.tu < 0);

        System.out.print("Nhap mau so: ");

        do {
            this.mau = scanner.nextInt();
        } while (tu == 0);

    }

    @Override
    public String toString() {

        return tu + "/" + mau;
    }

    public int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

    public PhanSo rutGon() {
        int a = ucln(tu, mau);

        if (a == 0)
            return this;

        tu /= a;
        mau /= a;
        return this;
    }

    public PhanSo cong(PhanSo p) {
        return new PhanSo(p.tu * this.mau + p.mau * this.tu, p.mau * this.mau);
    }

    public PhanSo tru(PhanSo p) {
        return new PhanSo(p.mau * this.tu - p.tu * this.mau, p.mau * this.mau);
    }

    public PhanSo nhan(PhanSo p) {
        return new PhanSo(p.tu * this.tu, p.mau * this.mau);
    }

    public PhanSo chia(PhanSo p) {
        if (p.tu == 0)
            throw new IllegalArgumentException("Khong the chia cho 0");

        return new PhanSo(p.mau * this.tu, this.mau * p.tu);
    }

}
