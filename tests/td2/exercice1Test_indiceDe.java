package td2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercice1Test_indiceDe {

  @Test
  void indiceDe_empty() {
    assertEquals(exercice1.indiceDe(new int[]{}, 1), -1);
  }

  @Test
  void indiceDe_1_element_present() {
    assertEquals(exercice1.indiceDe(new int[]{1}, 1), 0);
  }

  @Test
  void indiceDe_1_element_not_present() {
    assertEquals(exercice1.indiceDe(new int[]{1}, 2), -1);
  }

  @Test
  void indiceDe_2_element_present() {
    assertEquals(exercice1.indiceDe(new int[]{1, 2}, 1), 0);
    assertEquals(exercice1.indiceDe(new int[]{1, 2}, 2), 1);
  }

  @Test
  void indiceDe_2_element_not_present() {
    assertEquals(exercice1.indiceDe(new int[]{1, 2}, 3), -1);
  }

  @Test
  void indiceDe_3_element_present() {
    assertEquals(exercice1.indiceDe(new int[]{1, 2, 3}, 1), 0);
    assertEquals(exercice1.indiceDe(new int[]{1, 2, 3}, 2), 1);
    assertEquals(exercice1.indiceDe(new int[]{1, 2, 3}, 3), 2);
  }

  @Test
  void indiceDe_3_element_not_present() {
    assertEquals(exercice1.indiceDe(new int[]{1, 2, 3}, 4), -1);
  }
}