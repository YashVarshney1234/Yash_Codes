
import java.util.Scanner;
public class Week_7_Q2 {
    public static void sort(int b[],int n)
    {
        int temp,i;
        System.out.println("Elements after arranging in ascending order:");
        for(int pass=1;pass<=n-1;pass++)
        {
            for(i=0;i<=(n-1-pass);i++)
            {
                if(b[i]>b[i+1])
                {
                    temp=b[i];
                    b[i]=b[i+1];
                    b[i+1]=temp;
                }
            }
        }
        for(int ele:b)
            System.out.println(ele);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter length of array:");
        n=sc.nextInt();
        int b[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print("Enter element-"+(i+1)+":");
            b[i]=sc.nextInt();
        }
        sort(b,n);
    }

}
