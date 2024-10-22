
import java.util.Scanner;
public class Week3_Q4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        float avg;
        System.out.print("Enter a=");
        a=sc.nextInt();
        System.out.print("Enter b=");
        b=sc.nextInt();
        System.out.print("Enter c=");
        c=sc.nextInt();
        avg=(a+b+c)/3;
        System.out.println("Average="+avg);
    }
    
}
