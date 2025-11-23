import java.util.Scanner;

public class ArrayFrequencyCounter {

    public static void main(String[] args) {
        // Use Scanner for input, similar to cin in C++
        Scanner scanner = new Scanner(System.in);

        // 1. Input Array Size (n)
        int n;
        System.out.print("Enter the number of elements (n): ");
        n = scanner.nextInt();

        // Initialize the input array
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        // Read input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // --- PRECOMPUTE (Hashing/Frequency Counting) ---

        // This is the "hash map" implemented as an array.
        // Size 13 implies it can count numbers from 0 up to 12.
        int[] hash = new int[13]; // Indices 0 to 12 are available

        // Iterate through the input array and count frequencies
        for (int i = 0; i < n; i++) {
            // Check for valid index to prevent Array Index Out Of Bounds
            if (arr[i] >= 0 && arr[i] < hash.length) {
                // arr[i] is the KEY (the number itself), which becomes the ARRAY INDEX.
                // We increment the VALUE (the count) at that index.
                hash[arr[i]] += 1;
            } else {
                // If the number is outside the [0, 12] range, we ignore it 
                // or handle the error, as the C++ code would crash.
                System.err.println("Warning: Element " + arr[i] + " is out of the [0, 12] range and was skipped.");
            }
        }

        // --- FETCH (Querying) ---

        // 2. Input Queries (q)
        int q;
        System.out.print("Enter the number of queries (q): ");
        q = scanner.nextInt();

        while (q-- > 0) {
            int number;
            System.out.print("Enter number to query: ");
            number = scanner.nextInt();

            // Look up the count using the number as the index
            if (number >= 0 && number < hash.length) {
                // Output the count stored at the calculated index
                System.out.println("Frequency of " + number + ": " + hash[number]);
            } else {
                System.out.println("Frequency of " + number + ": 0 (Out of precomputed range)");
            }
        }

        scanner.close();
    }
}