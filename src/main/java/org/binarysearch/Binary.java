package org.binarysearch;

import java.util.Arrays;

public class Binary {

    static void search(int arr[],int key){

        int index= Arrays.binarySearch(arr,0,1,key);

        if(index>=0){
            System.out.println(arr[index+1]);
        }

        else{
            System.out.println(arr[Math.abs(index)-1]);
        }
       // System.out.println(index);

    }

    public static void main(String[] args) {

        int array[] = { 10, 20, 30, 30, 40, 50 };
        int key = 35;

        search(array,key);


    }
}
