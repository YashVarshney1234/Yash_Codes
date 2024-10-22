

import java.util.Scanner;
public class Week_5_Q4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        double sum=0;
        System.out.print("Enter n=");
        n=sc.nextInt();
        for(double i=1;i<=n;i++)
        {
            sum=sum+(1/i);
        }
        System.out.println("Sum of series:"+sum);
     
    }
    
}
        
    

