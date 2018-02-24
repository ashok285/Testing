
public class EncapsulationTesting {

  public static void main(String[] args) {
    EncapuslationPojo encapuslationPojo = new EncapuslationPojo();
    encapuslationPojo.setEmpId(39);
    encapuslationPojo.setEmpName("Ashok");
    encapuslationPojo.setSkills("java,python");
    System.out.println("Empid :" + encapuslationPojo.getEmpId());
    System.out.println("EmpName :" + encapuslationPojo.getEmpName());
    System.out.println("Emp Skills :" + encapuslationPojo.getSkills());
  }
}
