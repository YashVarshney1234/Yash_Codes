

import java.util.Scanner;

public class Week_5_Q2 {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements stored in array:");
        n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element-"+(i+1)+":");
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=b[i];           
        }
        System.out.println("Sum of array elements:"+sum);
    }
    
}
