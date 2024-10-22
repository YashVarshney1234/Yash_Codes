
import java.util.Scanner;

public class Week4_Q4 {

    public static void main(String[] args) {
        int N,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter N:");
        N=sc.nextInt();
        for(int i=1;i<=N;i++)
        {
            sum+=i;
        }
        System.out.println("Sum of Series:"+sum);
        
     
    }
    
}
