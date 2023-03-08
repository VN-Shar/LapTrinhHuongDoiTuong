package Temp;

public class Temp {
    public static void main(String[] args) {

        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int) (Math.random() * 1000);
        sort(arr);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "\t");

    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
}
