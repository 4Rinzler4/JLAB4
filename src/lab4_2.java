import java.util.Random;
import java.util.Scanner;

public class lab4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        boolean continueExecution = true;
        while (continueExecution) {
            System.out.print("Введіть розмірність квадратної матриці: ");
            int size = scanner.nextInt();
            int[][] matrix = new int[size][size];

            System.out.print("Оберіть спосіб заповнення матриці (1 - рандом, 2 - введення з клавіатури): ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                fillRandom(matrix, random);
            } else if (choice == 2) {
                fillFromInput(matrix, scanner);
            } else {
                System.out.println("Некоректний вибір. Матриця буде заповнена випадковими значеннями.");
                fillRandom(matrix, random);
            }

            System.out.println("Отримана матриця:");
            printMatrix(matrix);

            boolean isSymmetric = checkSymmetry(matrix);
            if (isSymmetric) {
                System.out.println("Матриця є симетричною відносно головної діагоналі.");
            } else {
                System.out.println("Матриця не є симетричною відносно головної діагоналі.");
            }

            System.out.print("Бажаєте продовжити роботу? (1 - так, 0 - ні): ");
            int continueChoice = scanner.nextInt();
            continueExecution = continueChoice == 1;
        }

        scanner.close();
    }

    public static void fillRandom(int[][] matrix, Random random) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(201) - 100;
            }
        }
    }

    public static void fillFromInput(int[][] matrix, Scanner scanner) {
        System.out.println("Введіть елементи матриці:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Елемент [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int cell : row) {
                System.out.print(cell + "\t");
            }
            System.out.println();
        }
    }

    public static boolean checkSymmetry(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
