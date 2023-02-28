package buoi2.bai3;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ToaDo ps1 = new ToaDo();
        System.out.println("Toa do 1: " + ps1);

        ps1.nhapToaDo(scanner);
        System.out.println("Toa do 1: " + ps1);

        ToaDo ps2 = new ToaDo(4, 16);

        System.out.print("Nhap toa do: ");
        ToaDo ps3 = new ToaDo(scanner.nextInt(), scanner.nextInt());

        System.out.println(ps1.cong(ps3));

        System.out.println(new ToaDo(ps1).nhan(ps2));

        scanner.close();
    }

}
