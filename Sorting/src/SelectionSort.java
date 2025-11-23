public class SelectionSort{

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {

            // Find the minimum element in the unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            // of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

            // Optional: Print array after every pass to see the progress
            // System.out.println("Pass " + (i+1) + ": " + java.util.Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        int[] data = {64, 25, 12, 22, 11};

        System.out.println("Original Array:");
        for (int num : data) System.out.print(num + " ");

        selectionSort(data);

        System.out.println("\n\nSorted Array:");
        for (int num : data) System.out.print(num + " ");
    }
}