//сотрудник

abstract class Personel {
  String nameOfPos;

  public void helloPers(Personel x) {
    System.out.println("Добро пожаловать " + x.getName());
  }

  public String getName () {
    return nameOfPos;
  }
}
