import java.util.ArrayList;

class PersListSingleton {
  private static PersListSingleton pl;
  private ArrayList<Personel> pers;

  private PersListSingleton() { };

  public static PersListSingleton getPl() {
    if (pl == null) {
        pl = new PersListSingleton();
    }
    return pl;
  }

    public void setPers(Personel x) {
    pl.pers.add(x);
  }

  public Personel getPersElement(int ind) throws NullPointerException {
    return pers.get(ind);
  } 

  public ArrayList<Personel> getPersArray() throws NullPointerException {
    return pers;
  } 
  
}
