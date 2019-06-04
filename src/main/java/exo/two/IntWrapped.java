package exo.two;

public class IntWrapped {

  private int value;

  public IntWrapped(int i) {

    value = i;
  }

  public boolean isEqual(Object obj) {
    return super.equals(obj);
  }
}
