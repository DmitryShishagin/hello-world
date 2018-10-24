//класс для теста

class Company {
  private String [] listOfDep = {"Отдел кадров", "Бухгалтерия", "Отдел автоматизации"};
  private String [] companyVacancy = {"Начальник", "Программист", "Тестировщик","Аналитик"};
  private HrDep hr;
  private AccDep acd;
  private AutoDep ade;
  private Company comp;

  public static void main (String[] args) {
    Company comp = new Company(); 
      comp.dep();
      comp.pers();
      comp.singl(); 
  }

    public void dep() {
      for (int i = 0; i < listOfDep.length; i++) {
        if (listOfDep[i] == "Отдел кадров") {
           HrDep hr = new HrDep (listOfDep[i]);
           hr.openDep(hr);
        }
        if (listOfDep[i] == "Бухгалтерия") {
           AccDep acd = new AccDep (listOfDep[i]);
           acd.openDep(acd);
        }
        if (listOfDep[i] == "Отдел автоматизации") {
           AutoDep ade = new AutoDep (listOfDep[i]);
           ade.openDep(ade);
        }
      }
   }

    public void pers() {
      hr.hirePers(companyVacancy);
    }

    public void singl() {
      comp.getFromSingleton(0, "Первый");

      int size = PersListSingleton.getPl().getPersArray().size();

      comp.getFromSingleton(size, "Последний");
    }
 
    public void getFromSingleton(int x, String z) {
      Worker work;
      Boss bos;

      if (PersListSingleton.getPl().getPersElement(x) instanceof Worker) {
        work = (Worker) PersListSingleton.getPl().getPersElement(x);
        System.out.println (z + " в списке - " + work.getName());
      } else {
        bos = (Boss) PersListSingleton.getPl().getPersElement(x);  
        System.out.println (z + " в списке - " + bos.getName()); 
      }   
    }
}
