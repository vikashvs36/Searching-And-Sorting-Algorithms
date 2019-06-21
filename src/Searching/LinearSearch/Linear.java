package Searching.LinearSearch;

import java.util.Scanner;

public class Linear {

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
        int pos=search(arr, arr.length, searchItem);
        if (pos != -1 ) {
            System.out.println("Position : "+(pos+1));
        }else {
            System.out.println("Sorry, Given number "+searchItem+" is not in list : ");
        }
    }

    public static int search(int[] arr, int length, int searchItem) {
        for (int i=0;i<length;i++) {
            if (searchItem == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
