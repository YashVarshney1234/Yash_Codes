

import java.util.Scanner;

public class Week_6_Q3 {

    public static void main(String[] args) {
        int n,temp;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements stored in array:");
        n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element-"+(i+1)+":");
            b[i]=sc.nextInt();
        }
        temp=b[0];
        b[0]=b[n-1];
        b[n-1]=temp;
        System.out.println("Array elements after swapping:");
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }     
    }
    
}
