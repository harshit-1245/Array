package patterns;

/**
 * This program prints a right-angled triangle of stars using recursion.
 */
public class question2 {
    public static void main(String[] args) {
        printRightAngleTriangle(5);
    }

    public static void printRightAngleTriangle(int rows) {
        printTriangleRecursive(rows, 0);
    }

    private static void printTriangleRecursive(int rows, int currentRow) {
        // Base case: stop recursion when we reach the last row
        if (currentRow == rows) {
            return;
        }

        // Print stars for the current row
        printStars(currentRow + 1);

        // Move to the next line
        System.out.println();

        // Recursively call the function for the next row
        printTriangleRecursive(rows, currentRow + 1);
    }

    private static void printStars(int count) {
        // Helper function to print stars for the given count
        if (count > 0) {
            System.out.print("*");
            printStars(count - 1);
        }
    }
}
