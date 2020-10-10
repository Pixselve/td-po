package td2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class exercice1Test_enClair {

  @Test
  void enClair_empty() {
    assertEquals(exercice1.enClair(new int[]{}), "{}");

  }

  @Test
  void enClair_1_element() {
    assertEquals(exercice1.enClair(new int[]{1}), "{1}");

  }

  @Test
  void enClair_2_elements() {
    assertEquals(exercice1.enClair(new int[]{1, 2}), "{1, 2}");

  }

  @Test
  void enClair_3_elements() {
    assertEquals(exercice1.enClair(new int[]{1, 2, 3}), "{1, 2, 3}");
  }
}