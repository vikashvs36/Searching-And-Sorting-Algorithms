package Sorting.MergeSort;

public class MergeSort {

    public static int[] mergeSort(int[] array) {

        if (array.length <= 1) { return array; }

        int mid=(array.length)/2;

        int[] left=new int[mid];
        int[] right;

        if (array.length%2==0) { right=new int[mid]; }
        else { right=new int[mid+1]; }

        for (int i=0; i<mid; i++) { left[i]=array[i]; }

        for (int j=0; j<right.length; j++) { right[j]=array[mid+j]; }

        left=mergeSort(left);
        right=mergeSort(right);

        return merge(left, right);
    }

    public static int[] merge(int[] arr1, int[] arr2){

        int len1=arr1.length, len2=arr2.length;
        int i=0, j=0, k=0;
        int[] arr3=new int[len1+len2];

        while ( i<len1 && j<len2 ) {
            if (arr1[i] <= arr2[j]) { arr3[k++] = arr1[i++]; }
            else { arr3[k++] = arr2[j++]; }
        }

        for (int a = i ; a < len1; a++ ) { arr3[k++] = arr1[a]; }

        for (int a = j ; a < len2; a++ ) { arr3[k++] = arr2[a]; }

        return arr3;
    }

    public static void main(String[] args) {

        int[] arr={54,26,93,17,77,31,44,55,20};
        System.out.println("Array before sorting");
        printArr(arr);
        int[] result=mergeSort(arr);
        System.out.println("\n\nArray After sorting");
        printArr(result);

    }

    private static void printArr(int[] array) {
        for (int i: array) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
