public class Manager extends Personel implements Department, Salary {
  public Manager (String name) {
    nameOfPers = name;
  }

  public String getName (Manager x) {
    return nameOfPers;
  }

  public void switchOn() {
    System.out.println("Свет включен. Можно работать");
  }

  public void getSalary() {
    System.out.println("Зарплата");
  }
}
