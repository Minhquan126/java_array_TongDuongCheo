import java.util.Scanner;

public class TongDuongcheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang :");
        int sum1 = 0;
        int x = scanner.nextInt();
        int[][] matrix = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("Nhap phan tu cua mang :");
                int a = scanner.nextInt();
                matrix[i][j] = a;
            }
        }
        for (int i = 0; i < x; i++) {
            sum1 = matrix[i][i];
        }
        System.out.println("Sum 1 : " + sum1);
    }
}
