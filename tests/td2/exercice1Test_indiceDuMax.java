package td2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercice1Test_indiceDuMax {

  @Test
  void indiceDuMax_1_element() {
    assertEquals(exercice1.indiceDuMax(new int[]{1}), 0);
  }

  @Test
  void indiceDuMax_2_element() {
    assertEquals(1, exercice1.indiceDuMax(new int[]{1, 2}));
    assertEquals(0, exercice1.indiceDuMax(new int[]{3, 2}));
    assertEquals(0, exercice1.indiceDuMax(new int[]{3, 3}));
  }

  @Test
  void indiceDuMax_3_element() {
    assertEquals(2, exercice1.indiceDuMax(new int[]{1, 2, 3}));
    assertEquals(1, exercice1.indiceDuMax(new int[]{1, 4, 3}));
    assertEquals(0, exercice1.indiceDuMax(new int[]{4, 2, 3}));

    assertEquals(1, exercice1.indiceDuMax(new int[]{1, 3, 3}));
    assertEquals(0, exercice1.indiceDuMax(new int[]{4, 4, 3}));
    assertEquals(2, exercice1.indiceDuMax(new int[]{0, 0, 3}));
  }
}