import java.util.Scanner;
public class Week_7_Q3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.print("Enter string:");
        str=sc.nextLine();
        int len=str.length();
        int i;
        for(i=len-1;i>=0;i--)
        {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    } 
}
