package td2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class exercice2Test_transpose {

  @Test
  void transpose_empty() {
    assertArrayEquals(new int[][]{}, exercice2.transpose(new int[][]{}));
  }

  @Test
  void transpose_length_1() {
    assertArrayEquals(new int[][]{new int[]{1}}, exercice2.transpose(new int[][]{new int[]{1}}));
  }

  @Test
  void transpose_length_2() {
    assertArrayEquals(new int[][]{new int[]{1, 3}, new int[]{2, 4}}, exercice2.transpose(new int[][]{new int[]{1, 2}, new int[]{3, 4}}));
  }

  @Test
  void transpose_length_3() {
    assertArrayEquals(new int[][]{new int[]{1, 4, 7}, new int[]{2, 5, 8}, new int[]{3, 6, 9}}, exercice2.transpose(new int[][]{new int[]{1, 2, 3}, new int[]{4, 5, 6}, new int[]{7, 8, 9}}));
  }
}