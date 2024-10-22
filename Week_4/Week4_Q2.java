
import java.util.Scanner;

public class Week4_Q2 {

    public static void main(String[] args) {
        int a,b,c,max;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a=");
        a=sc.nextInt();
        System.out.print("Enter b=");
        b=sc.nextInt();
        System.out.print("Enter c=");
        c=sc.nextInt();
        max=a;
        if(b>max)
            b=max;
        if(c>max)
            c=max;
        System.out.println("Largest no.:"+max);
        
        // TODO code application logic here
    }
    
}
