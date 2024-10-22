
import java.util.Scanner;

public class Week_6_Q4 {

    public static void main(String[] args) {
        int n,max,min;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements stored in array:");
        n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element-"+(i+1)+":");
            b[i]=sc.nextInt();
        }
        max=min=b[0];
        for(int i=0;i<n;i++)
        {
            if(max<b[i])
                max=b[i];
            if(min>b[i])
                min=b[i];
        }
        System.out.println("Maximum element:"+max);
        System.out.println("Minimum element:"+min);
    }
    
}
