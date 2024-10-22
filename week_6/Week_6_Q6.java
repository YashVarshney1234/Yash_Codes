

import java.util.Scanner;

public class Week_6_Q6 {

    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements stored in array:");
        n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element-"+(i+1)+":");
            b[i]=sc.nextInt();
        }
        int ele,pos=0;
        System.out.print("Enter value to be found:");
        ele=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++)
        {
            if(b[i]==ele)
            {
                flag=true;
                pos=i+1;
                break;
            }
        }
        if(flag==true)
            System.out.println(ele+" is found at position:"+pos);
        else
            System.out.println("Not Found");

    }
    
}
