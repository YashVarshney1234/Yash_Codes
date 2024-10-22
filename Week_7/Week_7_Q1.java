

import java.util.Scanner;
public class Week_7_Q1 {
public static void search(int b[],int key,int n)
{
    int fst=0,lst=n-1;
    int mid,pos=0;
    boolean flag=false;
    while(fst<=lst && flag==false)
    {
        mid=(fst+lst)/2;
        if(b[mid]==key)
        {
            pos=mid+1;
            flag=true;
        }
        if(b[mid]<key)
            fst=mid+1;
        if(b[mid]>key)
            lst=mid-1;
    }
    if(flag==false)
        System.out.println("Element is not found");
    else
        System.out.println(key+" is found at position "+pos);
}

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,key;
        System.out.print("Enter length of array:");
        n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter element-"+(i+1)+":");
            b[i]=sc.nextInt();
        }
        
        System.out.print("Enter element to be found:");
        key=sc.nextInt();
        search(b,key,n);
    }

}
