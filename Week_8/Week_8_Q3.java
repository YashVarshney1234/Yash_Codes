
import java.util.Scanner;
class FRUIT{
    String color;
    String taste;
    double price;
    FRUIT(String a,String b,double c)
    {
        color=a;
        taste=b;
        price=c;
    }
    void display()
    {
        System.out.println("Color="+color+"\nTaste="+taste+"\nPrice="+price);
    }
}

public class Week_8_Q3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String stc=new String();
        String sta=new String();
        double p;
        System.out.print("Enter color:");
        stc=sc.nextLine();
        System.out.print("Enter taste:");
        sta=sc.nextLine();
        System.out.print("Enter price:");
        p=sc.nextDouble();
        FRUIT f1=new FRUIT(stc,sta,p);
        f1.display();
    }

}
