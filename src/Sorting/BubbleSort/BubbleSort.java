package Sorting.BubbleSort;

public class BubbleSort {

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
            boolean flag=false;
            int temp=0;
            for (int j=0; j<n-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(flag != true) {
                break;
            }
        }
    }


    private static void print(int[] arr) {
        for (int element: arr)
            System.out.print(element+" ");
    }

}
