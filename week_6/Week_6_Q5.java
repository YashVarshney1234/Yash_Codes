

import java.util.Scanner;

public class Week_6_Q5 {

    public static void main(String[] args) {
        int cou=0;
        for(int i=0;i<=100;i++)
        {
            cou=0;
             for(int j=1;j<=i;j++)
                 {
                    if(i%j==0)
                      cou++;
                }
             if(cou==2)
                System.out.println(i);
        }
    }
    
}
