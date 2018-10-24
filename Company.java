public class Company {

  public static void main (String[] args) {
    Company comp = new Company();
    comp.go();
  }

  public void go() {
    Manager m = new Manager("Начальник");
    m.getName(m);
    m.switchOn();
    m.work();
    m.getSalary();
  } 
}
