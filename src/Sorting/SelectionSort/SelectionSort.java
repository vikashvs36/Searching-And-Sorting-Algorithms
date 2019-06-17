package Sorting.SelectionSort;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr={54,26,93,17,77,31,44,55,20};
        System.out.println("Array before sorting");
        print(arr);
        sort(arr, arr.length);
        System.out.println("\n\nArray After sorting");
        print(arr);
    }

    public static void sort(int[] arr, int n) {
        for (int i=0; i<n-1; i++) {

            int temp=arr[i], min_index=0;
            for (int j=i+1; j<n; j++) {
                if (temp>arr[j]) {
                    temp=arr[j];
                    min_index=j;
                }
            }

            if(min_index != 0) {
                arr[min_index]=arr[i];
                arr[i]=temp;
            }
        }
    }

    private static void print(int[] arr) {
        for (int element: arr)
            System.out.print(element+" ");
    }


}
