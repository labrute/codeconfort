package exo.one;

public class Exercice1 {

  public String fizzBuzzFunc(int i) {
    return new String[] { "Fizz", "", ""}[i % 3]
        + new String[] { "Buzz", "", "", "", ""}[i % 5]
        + new String[] {
            "", String.valueOf(i), String.valueOf(i), String.valueOf(i), String.valueOf(i) }[(i % 3 * i % 5)];
  }
}
