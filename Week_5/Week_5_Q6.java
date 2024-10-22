

import java.util.Scanner;
public class Week_5_Q6 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n,fact=1;
        System.out.print("Enter no.:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial="+fact);
          
    }
    
}
