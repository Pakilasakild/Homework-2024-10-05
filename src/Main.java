import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            arr2[i] =arr[i] * 2;
        }
        int n = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < size; i++){
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        System.out.println("Divisible by n: ");
        for (int i = 0; i < size; i++) {
            if (arr2[i] % n == 0) {
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
        for(int i = 0; i < size; i++){
            for (int j = i+1; j < size; j++){
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}