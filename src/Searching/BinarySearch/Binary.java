package Searching.BinarySearch;

import java.util.Scanner;

public class Binary {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int length=scanner.nextInt();
        int[] arr=new int[length];
        System.out.println("Please enter "+length+" element : ");
        for (int i=0; i<length; i++) {
            arr[i]=scanner.nextInt();
        }
        System.out.println("\nEnter number to sort : ");
        int searchItem=scanner.nextInt();
        int pos=search(arr, 0, arr.length-1, searchItem);
        if (pos != -1 ) {
            System.out.println("Position : "+(pos+1));
        }else {
            System.out.println("Sorry, Given number "+searchItem+" is not in list : ");
        }
    }

    public static int search(int[] arr, int low, int high, int searchIteam) {

        int mid=(low+high)/2;

        if (low>=high) { return -1; }

        if(arr[mid] > searchIteam) { return search(arr, low, mid-1, searchIteam); }

        else if (arr[mid] < searchIteam) { return search(arr, mid+1, high, searchIteam); }

        else { return mid; }
    }
}
