
public class Polymorphism extends Parent1 {

  static int add(int a, int b) {
    return a + b;
  }

  static double add(int a, int b, int c) {
    return a + b + c;
  }
  
//  static int addd(int a,int b){return a+b;}  
//  static double addd(int a,int b){return a+b;}  
  
   void msg() {
    super.msg();
    System.out.println("child msg");
  }
   
  public static void main(String[] args) {
    
    System.out.println(Polymorphism.add(11, 11));
    System.out.println(Polymorphism.add(11, 11, 11));
    Polymorphism ppp=new Polymorphism();
    ppp.msg();
  }
}

class Parent1{
   void msg() {
    System.out.println("parent msg");
  }
}
