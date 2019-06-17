package Sorting.QuickSort;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr={54,26,93,17,77,31,44,55,20};
        System.out.println("Array before sorting");
        print(arr);
        sort(arr, 0, arr.length-1);
        System.out.println("\n\nArray After sorting");
        print(arr);
    }

    public static void sort (int[] arr, int low, int high) {
        int pi=partition(arr, low, high);
        if (low < pi-1) {
            sort(arr, low, pi-1);
        }
        if (high > pi) {
            sort(arr, pi, high);
        }
    }


    public static int partition (int[] arr, int low, int high) {

        int pivot=arr[(low+high)/2];
        while (low <= high) {

            while (arr[low] < pivot){
                low++;
            }

            while (arr[high] > pivot){
                high--;
            }

            if (low <= high) {
                int temp=arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

                low++;
                high--;
            }
        }

        return low;
    }


    private static void print(int[] arr) {
        for (int element: arr)
            System.out.print(element+" ");
    }
}
