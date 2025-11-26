import java.util.ArrayList;

public class FindUnion {
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> unionList = new ArrayList<>();

        while (i < n && j < m) {
            // Check for duplicates in arr1
            if (i > 0 && arr1[i] == arr1[i-1]) {
                i++;
                continue;
            }
            // Check for duplicates in arr2
            if (j > 0 && arr2[j] == arr2[j-1]) {
                j++;
                continue;
            }

            // Comparison Logic
            if (arr1[i] < arr2[j]) {
                unionList.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                unionList.add(arr2[j]);
                j++;
            } else {
                unionList.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i < n) {
            if (i > 0 && arr1[i] == arr1[i-1]) {
                i++;
                continue;
            }
            unionList.add(arr1[i]);
            i++;
        }

        while (j < m) {
            if (j > 0 && arr2[j] == arr2[j-1]) {
                j++;
                continue;
            }
            unionList.add(arr2[j]);
            j++;
        }

        return unionList;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 6, 7};

        ArrayList<Integer> result = findUnion(arr1, arr2);

        for (int val : result) {
            System.out.print(val + " ");
        }
    }
}