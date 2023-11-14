import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]=new int[5];
        System.out.println("Enter the value of array");

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
           
        }
         for (int num : arr) {
            System.out.print(num);
         }
        
        
    }
}
