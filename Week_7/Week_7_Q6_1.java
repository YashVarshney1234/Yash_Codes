

import java.util.Scanner;
public class Week_7_Q6_1 {
    public static void fib(int ft,int se,int n)
    {
        if(n==0)
            return;
        else
        {
            System.out.println(ft);
            int th;
            th=ft+se;
            n--;
            fib(se,th,n);
        }      
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         System.out.print("Enter no. of terms:");
        int n=sc.nextInt();
        int ft=0,se=1;
        fib(ft,se,n);  
    }   
}
