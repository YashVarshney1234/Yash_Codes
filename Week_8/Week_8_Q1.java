

class FRUIT{
    String color;
    String taste;
    double price;
    void display()
    {
        System.out.print("Color="+color+"\nTaste="+taste+"\nPrice="+price);
        System.out.println("\n");
    }
}

public class Week_8_Q1 {
    public static void main(String[] args) {
      FRUIT f1=new FRUIT();
      FRUIT f2=new FRUIT();
      FRUIT f3=new FRUIT();
      f1.color="Red";
      f1.price=20.00;
      f1.taste="Sweet";
      System.out.println("Fruit-1");
      f1.display();
      f2.color="Orange";
      f2.price=50.00;
      f2.taste="Sweet & Sour";
      System.out.println("Fruit-2");
      f2.display();
      f3.color="Yellow";
      f3.price=20.00;
      f3.taste="Sweet";
      System.out.println("Fruit-3");
      f3.display();
    }
    
}
