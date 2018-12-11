import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class mainTest {
  Hand hand = new Hand();

  @Test
  public void testCompare () {
    Hand blackhand = new Hand();
    blackhand.add(new Card(13,"D"));
    blackhand.add(new Card(2,"H"));
    blackhand.add(new Card(3,"D"));
    blackhand.add(new Card(5,"S"));
    blackhand.add(new Card(9,"C"));

    Hand whitehand = new Hand ();
    whitehand.add(new Card(2,"C"));
    whitehand.add(new Card(3,"H"));
    whitehand.add(new Card(4,"S"));
    whitehand.add(new Card(8,"C"));
    whitehand.add(new Card(14,"H"));
    String expected = "14";


    assertEquals(expected,blackhand.compare(whitehand));
  }


}
