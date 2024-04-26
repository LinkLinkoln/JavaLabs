import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int size = scanner.nextInt();
        while (true) {
            switch (Menu(scanner)) {
                case 1:
                    int[][] matrix = CreateIdentityMatrix(size);
                    PrintMatrix(matrix);
                    break;
                case 2:
                    int[][] matrix2 = CreateZeroMatrix(size);
                    PrintMatrix(matrix2);
                    break;
                case 3:
                    int[][] matrix3 = InputMatrixByRandom(size);
                    int[][] matrix4 = InputMatrixByRandom(size);
                    int[][] matrix5 = AddMatrices(matrix3, matrix4);
                    System.out.println("1 матрица");
                    PrintMatrix(matrix3);
                    System.out.println("2 матрица");
                    PrintMatrix(matrix4);
                    System.out.println("результат");
                    PrintMatrix(matrix5);
                    break;
                case 4:
                    int[][] matrix6 = InputMatrixByRandom(size);
                    int[][] matrix7 = InputMatrixByRandom(size);
                    int[][] matrix8 =  MultiplyMatrix(matrix6, matrix7);
                    System.out.println("1 матрица");
                    PrintMatrix(matrix6);
                    System.out.println("2 матрица");
                    PrintMatrix(matrix7);
                    System.out.println("результат");
                    PrintMatrix(matrix8);
                    break;
                case 5:
                    int[][] matrix9 = InputMatrixByRandom(size);
                    int scalar = scanner.nextInt();
                    int[][] matrix10 = MultiplyMatrixByScalar(matrix9, scalar);
                    System.out.println("матрица");
                    PrintMatrix(matrix9);
                    System.out.println("результат умножения на скаляр");
                    PrintMatrix(matrix10);
                    break;
                case 6:
                    int[][] matrix11 = InputMatrixByRandom(size);
                    int determinant = СalculateDeterminant(matrix11);
                    System.out.println("матрица");
                    PrintMatrix(matrix11);
                    System.out.println("деткрминант" + determinant);
                    break;
                default:
                    System.out.println("Неверно введены даннные");
                    break;
            }
        }
    }
    public static int Menu(Scanner scanner)
    {
      System.out.print("1.Создание диагональной матрицы\n" +
              "2.Cоздание нулевой матрицы\n" +
              "3.Сложение матриц\n" +
              "4.Умножение матриц\n" +
              "5.Умножение матрицы на скаляр\n" +
              "6.Определение детерминанта матрицы\n" +
              "7.Вывод матрицы на консоль");
      int choice=scanner.nextInt();
      return choice;
    }
  public static int[][] InputMatrixByRandom(int size)
  {
      int[][] matrix = new int[size][size];
      Random random=new Random();
      for (int i = 0; i < size; i++)
      {
          for (int j = 0; j < size; j++)
          {
              matrix[i][j]= random.nextInt(0,10);
          }
      }
      return matrix;
  }

    public static int[][] CreateIdentityMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix;
    }

    public static int[][] CreateZeroMatrix(int size) {
        int[][] matrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = 0;
            }
        }

        return matrix;
    }

    public static int[][] AddMatrices(int[][] matrixA, int[][] matrixB) {
        int size = matrixA.length;
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        return result;
    }

    public static int[][] MultiplyMatrix(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols2 = matrix2[0].length;

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                int sum = 0;
                for (int k = 0; k <  matrix1[0].length; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                result[i][j] = sum;
            }
        }

        return result;
    }

    public static int[][] MultiplyMatrixByScalar(int[][] matrix, int scalar) {
        int size = matrix.length;
        int[][] result = new int[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                result[i][j] = matrix[i][j] * scalar;
            }
        }

        return result;
    }

    public static int СalculateDeterminant(int[][] matrix) {
        int size = matrix.length;
        int determinant = 0;

        if (size == 1) {
            return matrix[0][0];
        } else if (size == 2) {
            return (matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]);
        } else {
            for (int i = 0; i < size; i++) {
                int[][] subMatrix = new int[size - 1][size - 1];
                for (int j = 1; j < size; j++) {
                    int subMatrixColumn = 0;
                    for (int k = 0; k < size; k++) {
                        if (k == i) {
                            continue;
                        }
                        subMatrix[j - 1][subMatrixColumn] = matrix[j][k];
                        subMatrixColumn++;
                    }
                }
                int sign = (int) Math.pow(-1, i);
                int subDeterminant = СalculateDeterminant(subMatrix);
                determinant += matrix[0][i] * sign * subDeterminant;
            }
        }

        return determinant;
    }
    public static void PrintMatrix(int[][] matrix) {
        int size = matrix.length;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}