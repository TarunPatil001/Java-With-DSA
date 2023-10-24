public class DividenConquer {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // (si+ei)/2;
        mergeSort(arr, si, mid); // left sort;
        mergeSort(arr, mid + 1, ei); // right sort;
        merge(arr, si, mid, ei); // Both merge;
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        // [0-3] = 4 <--(3-0+1) [4-6] = 3 <--(6-4+1) (4+3) = 7 <--(6-0+1)
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left part
        int j = mid + 1; // iterator for right part
        int k = 0; // iterator for temp arr

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) { // Comparision of left & right part.
                temp[k] = arr[i];
                i++;

            } else {
                temp[k] = arr[j]; // When only single element is there.
                j++;
            }
            k++;
        }

        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Both parts are merge
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
