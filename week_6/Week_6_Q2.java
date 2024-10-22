

import java.util.Scanner;

public class Week_6_Q2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,cou=0;
        System.out.print("Enter number:");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                cou++;
        }
        if(cou==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    
}
