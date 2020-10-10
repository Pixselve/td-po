package td2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercice1Test_enClair_booleans {
  @Test
  void enClair_booleans_empty() {
    assertEquals("{}", exercice1.enClair(new boolean[]{}));
  }

  @Test
  void enClair_booleans_1_element() {
    assertEquals("{0}", exercice1.enClair(new boolean[]{true}));
    assertEquals("{}", exercice1.enClair(new boolean[]{false}));
  }

  @Test
  void enClair_booleans_2_elements() {
    assertEquals("{}", exercice1.enClair(new boolean[]{false, false}));
    assertEquals("{0}", exercice1.enClair(new boolean[]{true, false}));
    assertEquals("{1}", exercice1.enClair(new boolean[]{false, true}));
    assertEquals("{0, 1}", exercice1.enClair(new boolean[]{true, true}));
  }

  @Test
  void enClair_booleans_3_elements() {
    assertEquals("{}", exercice1.enClair(new boolean[]{false, false, false}));

    assertEquals("{0}", exercice1.enClair(new boolean[]{true, false, false}));
    assertEquals("{1}", exercice1.enClair(new boolean[]{false, true, false}));
    assertEquals("{2}", exercice1.enClair(new boolean[]{false, false, true}));

    assertEquals("{0, 1}", exercice1.enClair(new boolean[]{true, true, false}));
    assertEquals("{1, 2}", exercice1.enClair(new boolean[]{false, true, true}));
    assertEquals("{0, 2}", exercice1.enClair(new boolean[]{true, false, true}));


    assertEquals("{0, 1, 2}", exercice1.enClair(new boolean[]{true, true, true}));
  }
}