package dsa.array;

public class RotateArray {
    public static void main(String[] args) {
       int arr[]={1,2,3,4,5};
       int k=2;
System.out.println("Original Array");
       printArray(arr);
       rotateArrayWithKElement(arr,k);

        

       System.out.println("rotatedArray");
       printArray(arr);

    }

  public static void rotateArrayWithKElement(int arr[],int k){
       int n=arr.length;

       //set how many time rotate
       k=k%n;
          
       //rotate entire array
       rotateArray(arr, 0, n-1);

       //rotate k times
       rotateArray(arr, 0, k-1);

       //rotate remaining element
       rotateArray(arr, k, n-1);
  }


    public static void rotateArray(int arr[],int start,int end){
       while(start<end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
       }
    }
    public static void printArray(int[]arr){
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    }

