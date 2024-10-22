
import java.util.Scanner;

public class Week_5_Q5 {
    public static void main(String[] args) {
        int n,sum=0,dig;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter integer:");
        n=sc.nextInt();
        while(n>0)
        {
            dig=n%10;
            sum+=dig;
            n=n/10;
        }
        System.out.println("Sum of digits="+sum);
        
    }
    
}
