import java.util.Scanner;
class Fruit
{
    String color;
    String taste;
    Double price;
    Fruit()
    {
        System.out.println("Welcome to Fruit class");
    }
    Fruit(String c,String t)
    {
        this(50.00);
        color=c;
        taste=t;
    }
    Fruit(double p)
    {
        this();
        price=p;
    }
    void display()
    {
        System.out.println("Color="+color+"\nTaste="+taste+"\nPrice="+price+"\n");
    }
}
public class Week_8_Q4{
    public static void main(String[] args) {
        Fruit f3=new Fruit("Red","Sour");
        f3.display();
    }
}