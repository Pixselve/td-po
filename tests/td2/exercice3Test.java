package td2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercice3Test {

  @Test
  void iCoin() {
    assertEquals(0, exercice3.iCoin(1));
    assertEquals(0, exercice3.iCoin(2));
    assertEquals(0, exercice3.iCoin(3));

    assertEquals(1, exercice3.iCoin(4));
    assertEquals(1, exercice3.iCoin(5));
    assertEquals(1, exercice3.iCoin(6));

    assertEquals(2, exercice3.iCoin(7));
    assertEquals(2, exercice3.iCoin(8));
    assertEquals(2, exercice3.iCoin(9));
  }

  @Test
  void jCoin() {
  }
}