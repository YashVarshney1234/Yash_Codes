
import java.util.Scanner;

public class Week4_Q1 {

    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no.:");
        a=sc.nextInt();
        if(a%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    
}
