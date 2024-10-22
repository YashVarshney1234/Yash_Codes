import java.util.Scanner;
public class Week_7_Q4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.print("Enter string:");
        str=sc.nextLine();
        int i=0,j=str.length()-1;
        boolean flag=false;
        while(i<j && flag==false)
        {
            if(str.charAt(i)!=str.charAt(j))
               flag=true;
            i=i+1;
            j=j-1;
        }
        if(flag==false)
          System.out.println("Palindrome");
        else
          System.out.println("Not Palindrome");
    }
    
}
