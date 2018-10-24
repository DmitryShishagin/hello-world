//Отдел кадров

import java.util.ArrayList;

class HrDep extends Department  {
  String [] listOfVacancy;

  public HrDep (String name) {
    nameOfDep = name;
  }

  public void hirePers (String [] v) {
    listOfVacancy = v;
    for (int i = 0;i < listOfVacancy.length; i++) {
      if (listOfVacancy[i] == "Начальник") {
        Boss b = new Boss (listOfVacancy[i]);
        b.helloPers(b);
        PersListSingleton.getPl().setPers(b);
      } else {
        Worker w = new Worker (listOfVacancy[i]);
        w.helloPers(w);
        PersListSingleton.getPl().setPers(w);
      }
    }

   }
  
}
