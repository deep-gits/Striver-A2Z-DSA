public class InsertionSort{

    public static void insertionSort(int[] arr) {
        int n = arr.length;


        for (int i = 1; i <n; i++) {
            for (int j = i; j >=1 ; j--) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }else {
                    break;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] data = {12,90,23,54,6};

        System.out.println("Original Array:");
        for (int num : data) System.out.print(num + " ");

        insertionSort(data);

        System.out.println("\n\nSorted Array:");
        for (int num : data) System.out.print(num + " ");
    }
}