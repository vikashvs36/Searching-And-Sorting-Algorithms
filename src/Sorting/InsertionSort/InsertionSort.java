package Sorting.InsertionSort;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr={54,26,93,17,77,31,44,55,20};
        System.out.println("Array before sorting");
        print(arr);
        sort(arr, arr.length);
        System.out.println("\n\nArray After sorting");
        print(arr);
    }


    public static void sort(int[] arr, int n) {
        for (int i=0; i<n; i++) {
            int temp=arr[i], j=i ;
            while (j>0 && arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }


    private static void print(int[] arr) {
        for (int element: arr)
            System.out.print(element+" ");
    }
}
