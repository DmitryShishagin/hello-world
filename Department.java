//отдел

abstract class Department {
  String nameOfDep;

  public void openDep(Department x) {
    System.out.println(x.getName() + " открыт");
  }

  public String getName () {
    return nameOfDep;
  }
}
