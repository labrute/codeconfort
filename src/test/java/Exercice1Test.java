import static org.junit.Assert.*;

import org.junit.Test;

import exo.one.Exercice1;

public class Exercice1Test {

  @Test
  public void myTest(){
    Exercice1 ex1 = new Exercice1();
    for (int i = 0; i < 200; ++i) {
      assertEquals(test(i),ex1.fizzBuzzFunc(i));
    }
  }

  public String test(int i) {
        if (i % 3 == 0 && i % 5 == 0) { // i%3 + i%5 == 0
          return "FizzBuzz";
        } else if (i % 3 == 0) {  // i%3 + i%5 == [1,2,3,4]
          return "Fizz";
        } else if (i % 5 == 0) { // i%3 + i%5 == [1,2]
          return "Buzz";
        } else {
          return String.valueOf(i);
        }
  }
}