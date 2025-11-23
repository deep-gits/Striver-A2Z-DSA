public class BubbleSort{

    public static void bubbleSort(int[] arr) {
        int n = arr.length;


        for (int i = n-1; i >=1; i--) {

            int didswap=0;
            for (int j = 0; j <=i-1 ; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    didswap=0;
                }
            }
            if(didswap==0) break;
            System.out.println("swap");
        }

    }

    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};

        System.out.println("Original Array:");
        for (int num : data) System.out.print(num + " ");

        bubbleSort(data);

        System.out.println("\n\nSorted Array:");
        for (int num : data) System.out.print(num + " ");
    }
}