
public class Parent extends ChildClass{

  int id;
  String name;
  
  public String getName(String name) {
    System.out.println("Name :"+name);
    return name;
  }
  
  public static void main(String[] args) {
    String body = "class=\\\"lia-vid-container video-embed-center\\\"><div id=\\\"lia-vid-p5bWxtZDE6deFsL--A8HOBcD";

    
    if (null != body && body.length() > 0 && body.indexOf("lia-vid-container video-embed-center") >= 0) {
       System.out.println();
    }

  }
}

class ChildClass {
  
  public int getId(int id) {
    System.out.println("Id :"+id);
    return id;
  }
 
}

