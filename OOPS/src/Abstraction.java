
public class Abstraction extends Bike {

  @Override
  void run() {
    System.out.println("running safely..");
  }

  public static void main(String[] args) {
    Abstraction obj = new Abstraction();
    obj.run();
  }
}

abstract class Bike {
  abstract void run();

  public void ran() {

  }
}