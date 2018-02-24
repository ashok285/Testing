import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassAndObject {

  // states
  int EmpId;
  String EmpName;

  // Behaviors
  public void designation(String designation) {
    System.out.println(EmpName + "working as a " + designation);
  }

  public static void main(String[] args) throws InstantiationException, IllegalAccessException,
      NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException,
      CloneNotSupportedException, FileNotFoundException, IOException, ClassNotFoundException {

    // java object creating
    // 1)by using new keyword
    ClassAndObject classAndObject = new ClassAndObject();
    classAndObject.EmpName = "Ashok";
    classAndObject.designation("Software Developer");

    // 2)Using newInstance() method
    ClassAndObject classAndObject2 = ClassAndObject.class.newInstance();
    classAndObject2.EmpName = "Ashok";
    classAndObject2.designation("Software Developer2");

    // 3)Using newInstance() method of Constructor class
    Constructor<ClassAndObject> constructor = ClassAndObject.class.getConstructor();
    ClassAndObject classAndObject3 = constructor.newInstance();
    classAndObject3.EmpName = "Ashok";
    classAndObject3.designation("Software Developer3");
   
  }
}
