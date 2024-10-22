import java.util.Scanner;
public class Week_7_Q6_2 {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of terms:");
        int n=sc.nextInt();
        int ft=0,se=1,th=ft+se,i;
        for(i=0;i<n;i++)
        {
            System.out.println(ft);
            ft=se;
            se=th;
            th=ft+se;
        }
        
    }
    
}
