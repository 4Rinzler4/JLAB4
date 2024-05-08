import java.util.Random;
import java.util.Scanner;
public class lab4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмірність квадратної матриці: ");
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(201) - 100;
            }
        }
        System.out.println("Згенерована матриця:");
        printMatrix(matrix);
        boolean isSymmetric = true;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }
        if (isSymmetric) {
            System.out.println("Матриця є симетричною відносно головної діагоналі.");
        } else {
            System.out.println("Матриця не є симетричною відносно головної діагоналі.");
        }
        scanner.close();
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }
}
