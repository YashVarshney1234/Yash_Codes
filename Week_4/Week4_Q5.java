
import java.util.Scanner;

public class Week4_Q5 {

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No.:");
        a=sc.nextInt();
        while(a>10)
        {
            System.out.println(a);
            a=a/2;         
        }
       
    }
    
}
