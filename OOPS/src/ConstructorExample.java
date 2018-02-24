
public class ConstructorExample {

  ConstructorExample() {
    System.out.println("Default Constructor is called");
  }

  ConstructorExample(int empSize) {
    System.out.println("Parameterized Constructor is called");
  }

  public static void main(String[] args) {
    // default constructor calling
    ConstructorExample constructorExample = new ConstructorExample();
    // Parameterized constructor is calling
    ConstructorExample constructorExample1 = new ConstructorExample(10);
  }
}
