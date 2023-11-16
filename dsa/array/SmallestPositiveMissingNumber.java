package dsa.array;

public class SmallestPositiveMissingNumber {
    public static void main(String[] args) {
        // Array initialization
        int arr[] = {1, 2, 4, 5, 6, 7, 8};

        // Calling the method and printing the result
        System.out.println(smallestNumber(arr));
    }

    // Method to find the smallest missing positive number
    public static int smallestNumber(int arr[]) {
        // Loop through each number from 1 to length of the array + 1
        for (int i = 1; i < arr.length + 1; i++) {
            // Variable to track if the current number is found in the array
            int found = 0;

            // Iterate through the array to check if the current number exists
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) { // If the current number is found in the array
                    found = 1; // Set found flag to 1 and break the loop
                    break;
                }
            }
            
            // If the current number is not found in the array
            if (found == 0) {
                return i; // Return the missing number
            }
        }
        return -1; // Return -1 if no missing number is found
    }
}
