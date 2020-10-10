package td2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercice2Test_estDiagonale {

  @Test
  void estDiagonale_empty() {
    assertTrue(exercice2.estDiagonale(new int[][]{}));
  }

  @Test
  void estDiagonale_length_1() {
    assertTrue(exercice2.estDiagonale(new int[][]{new int[]{1}}));
    assertTrue(exercice2.estDiagonale(new int[][]{new int[]{0}}));
  }

  @Test
  void estDiagonale_length_2() {
    assertTrue(exercice2.estDiagonale(new int[][]{new int[]{1, 0}, new int[]{0, 1}}));

    assertFalse(exercice2.estDiagonale(new int[][]{new int[]{1, 1}, new int[]{0, 1}}));
    assertFalse(exercice2.estDiagonale(new int[][]{new int[]{1, 1}, new int[]{1, 1}}));
  }
  @Test
  void estDiagonale_length_3() {
    assertTrue(exercice2.estDiagonale(new int[][]{new int[]{1, 0, 0}, new int[]{0, 1, 0}, new int[]{0, 0, 1}}));

    assertFalse(exercice2.estDiagonale(new int[][]{new int[]{1, 1, 0}, new int[]{0, 1, 0}, new int[]{0, 0, 1}}));
    assertFalse(exercice2.estDiagonale(new int[][]{new int[]{1, 0, 0}, new int[]{0, 1, 1}, new int[]{0, 0, 1}}));
    assertFalse(exercice2.estDiagonale(new int[][]{new int[]{1, 0, 0}, new int[]{0, 1, 0}, new int[]{1, 0, 1}}));
  }
}