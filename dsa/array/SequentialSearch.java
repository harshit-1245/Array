package dsa.array;

public class SequentialSearch {
    public static void main(String[] args) {
        int arr[]={10,2,8,7,5};
        int ans=search(arr, 10);
        System.out.println(ans);
    }
    public static int search(int arr[],int target){
        if(arr.length<0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
          if(arr[i]==target){
            return i;
          }
        }
        return 0;
    }
}
