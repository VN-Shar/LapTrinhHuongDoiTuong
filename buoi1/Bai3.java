package buoi1;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args) {

        int n, a[];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");

        // Nhap kic thuoc mang
        n = scanner.nextInt();

        a = new int[n];

        // Nhap gia tri vao mang
        for (int i = 0; i < n; i++) {

            System.out.print("Nhap phan tu thu " + i + " ");
            a[i] = scanner.nextInt();
        }

        // Tim phan tu lon nhat
        int max = a[0];

        for (int i = 1; i < n; i++) {
            max = a[i] > max ? a[i] : max;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println("Phan tu lon nhat trong mang la: " + max);

        scanner.close();
    }

}
