import java.lang.reflect.Array;
import java.util.Scanner;

public class FindTotal {
    public static void main(String[] args) {
        int arr[][] = new int[100][];
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter the amout of element:");
        int row = scanner.nextInt();
        for (int i = 0; i < row; i++) {

            System.out.printf("please enter amout of small elements %d:", i);
            int size = scanner.nextInt();
            arr[i] = new int[size];

            for (int j = 0; j < size; j++) {
                System.out.printf(" elements %d:", j);
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("your array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("\n");
        }
        System.out.print("which column you want to plus?");
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < row; i++) {
            if (arr[i].length > col) {
                sum += arr[i][col];
            }
        }
        System.out.println("total:" + sum);
    }
}