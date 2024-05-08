import java.util.Scanner;
public class lab4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість рядків (n): ");
        int n = scanner.nextInt();
        System.out.print("Введіть кількість стовпців (m): ");
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int max = matrix[0][0];
        int min = matrix[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        int countMax = 0;
        int countMin = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == max) {
                    countMax++;
                }
                if (matrix[i][j] == min) {
                    countMin++;
                }
            }
        }
        System.out.println("Кількість входжень максимального елементу: " + countMax);
        System.out.println("Кількість входжень мінімального елементу: " + countMin);
        scanner.close();
    }
}
