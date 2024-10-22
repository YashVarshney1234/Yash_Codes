
import java.util.*;
public class Week3_Q5 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x1,x2,y1,y2;
        System.out.println("Enter first point(x1,y1):");
        System.out.print("x1=");
        x1=sc.nextInt();
        System.out.print("y1=");
        y1=sc.nextInt();
        System.out.println("Enter second point(x2,y2):");
        System.out.print("x2=");
        x2=sc.nextInt();
        System.out.print("y2=");
        y2=sc.nextInt();
        System.out.println("Distance between two points:"+Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)));
 
    }
    
}
