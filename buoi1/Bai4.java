package buoi1;

import java.util.Scanner;

public class Bai4 {

    public static void main(String[] args) {

        // Kai bao
        int a[][];
        int m, n;

        Scanner scanner = new Scanner(System.in);
        // Nhap kich thuoc
        System.out.print("Nhap kich thuoc mang 2 chieu : ");
        m = scanner.nextInt();
        n = scanner.nextInt();

        // Tao mang voi kich thuoc nhap vao
        a = new int[m][n];

        // Gan gia tri vao mang
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 100);
            }
        }

        // In ra man hinh
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int total = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                total += a[i][j];
            }
        }
        System.out.println("Tong: " + total);

        scanner.close();
    }
}
