
public class Interface implements interfaceMain {

  @Override
  public void bike() {
    System.out.println("it is bike");
  }

  public static void main(String[] args) {
    Interface interface1 = new Interface();
    interface1.bike();
  }
}

interface interfaceMain {
  void bike();
}
