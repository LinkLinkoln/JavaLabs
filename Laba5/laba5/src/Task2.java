public class Task2
{
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (String element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(float[][] arr) {
        for (float[] row : arr) {
            for (float element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"A", "B","C","D"};
        int[][] int2DArray = {{1, 2}, {3, 4}, {5, 6}};
        float[][] float2DArray = {{1.1f, 2.2f}, {3.3f, 4.4f}};

        printArray(intArray);
        printArray(stringArray);
        printArray(int2DArray);
        printArray(float2DArray);
    }
}
