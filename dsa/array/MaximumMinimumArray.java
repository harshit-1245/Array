package dsa.array;

import java.util.Arrays;

public class MaximumMinimumArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};

        maxmin(arr, arr.length);
        printArray(arr);

    }
    public static void maxmin(int arr[],int size){
        //create a copy of original array
        int aux[]=Arrays.copyOf(arr, size);

        //even------->stop
        //odd------>start
        int start=0;
        int stop=size-1;

        for(int i=0;i<size;i++){
            if(i%2==0){
                arr[i]=aux[stop];
                stop--;
            }else{
                arr[i]=aux[start];
                start++;
            }
        }
    }
    public static void printArray(int arr[]){
        for(int num : arr){
            System.out.print(num +" ");
        }
    }
}
