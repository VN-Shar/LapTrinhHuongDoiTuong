package buoi2.bai3;

import java.util.Scanner;

public class ToaDo {

    private int x, y;

    public ToaDo() {
        this.x = 1;
        this.y = 0;
    }

    public ToaDo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ToaDo(ToaDo p) {
        this.y = p.y;
        this.x = p.x;
    }

    public void nhapToaDo() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap x: ");
        this.x = scanner.nextInt();
        System.out.print("Nhap y: ");
        this.y = scanner.nextInt();

        scanner.close();
    }

    @Override
    public String toString() {
        return y + "/" + x;
    }

    public ToaDo cong(ToaDo p) {
        return new ToaDo(this.x + p.y, this.y + p.y);
    }

    public ToaDo tru(ToaDo p) {
        return new ToaDo(this.x - p.y, this.y - p.y);
    }

    public ToaDo nhan(ToaDo p) {
        return new ToaDo(this.x * p.y, this.y * p.y);
    }

    public ToaDo chia(ToaDo p) {
        return new ToaDo(this.x / p.y, this.y / p.y);
    }

}
