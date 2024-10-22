
import java.util.Scanner;
class FRUIT{
    String color;
    String taste;
    double price;
    void set_Details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter color:");
        color=sc.nextLine();
        System.out.print("Enter taste:");
        taste=sc.nextLine();
        System.out.print("Enter price:");
        price=sc.nextDouble();
    }       
    void display()
    {
        System.out.print("Color="+color+"\nTaste="+taste+"\nPrice="+price);
        System.out.println("\n");
    }
}

public class Week_8_Q2{
    public static void main(String[] args) {
      FRUIT f1=new FRUIT();
      f1.set_Details();
      f1.display();
    }
    
}
