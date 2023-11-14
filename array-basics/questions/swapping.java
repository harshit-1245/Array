package questions;

import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
       
       swap(1, 2);
    }
    public static void swap(int a,int b){
         
    
        int temp=a;
        a=b;
        b=temp;
        System.out.print(a+" "+b);
    }
}
