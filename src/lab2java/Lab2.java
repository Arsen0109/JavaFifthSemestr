package lab2java;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/*
* Дія з матрицями: C=Bт
* Тип елементів матриці: int
* Дія з матрицею С: Знайти середнє значення елементів кожного стовпчика матриця
 * */
public class Lab2 {
    public static void printMatrix(int[][] Matrix){
        for (int[] matrix : Matrix) {
            System.out.println(Arrays.toString(matrix));
        }
    }

    public static void main(String[] args) {
        boolean isNotInt = true;
        int numOfRows;
        int numOfColumns;
        while (isNotInt) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter number of rows of matrix: ");
                numOfRows = scanner.nextInt();
                System.out.print("Enter number of columns of matrix: ");
                numOfColumns = scanner.nextInt();
                isNotInt = false;
                int[][] B = new int[numOfRows][numOfColumns];
                for (int i = 0; i < numOfRows; i++) {
                    int[] row = new int[numOfColumns];
                    for (int j = 0; j < numOfColumns; j++) {
                        Random random = new Random();
                        row[j] = random.nextInt(10);
                    }
                    B[i] = row;
                }

                System.out.println("Generated matrix B:");
                printMatrix(B);
                System.out.println();

                int[][] C = new int[numOfColumns][numOfRows];
                for (int i = 0; i < numOfRows; i++) {
                    for (int j = 0; j < numOfColumns; j++) {
                        C[j][i] = B[i][j];
                    }
                }

                System.out.println("Matrix C:");
                printMatrix(C);
                System.out.println();

                int index = 0;
                for (int[] row : B) {
                    int sum = 0;
                    int count = 0;
                    for (int col : row) {
                        sum += col;
                        count++;
                    }
                    index++;
                    System.out.println("Average value of column " + index + " equals " + (double) sum / count);
                }
            } catch (Exception e) {
                System.out.println("Your input is not Integer");
            }

        }
    }
}
