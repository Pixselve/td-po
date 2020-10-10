package td2;

public class exercice2 {
  /**
   * @param m une tableau carré d'entiers
   * @return true ssi m est diagonale (une matrice M est diagonale si seuls les éléments Mi, i peuvent être différents de 0).
   */
  public static boolean estDiagonale(int[][] m) {
    for (int y = 0; y < m.length; y++) {
      for (int x = 0; x < m[y].length; x++) {
        if (x != y && m[y][x] != 0) return false;
      }
    }
    return true;
  }

  /**
   * @param m une tableau carré d'entiers
   * @return la transposée de m
   */
  public static int[][] transposee(int[][] m) {
    int[][] result = new int[m.length][m.length];
    for (int y = 0; y < m.length; y++) {
      for (int x = 0; x < m[y].length; x++) {
        result[x][y] = m[y][x];
      }
    }
    return result;
  }

  /**
   * @param m une tableau carré d'entiers
   * @return la transposée de m
   */
  public static int[][] transpose(int[][] m) {
    for (int y = 0; y < m.length; y++) {
      for (int x = y; x < m[y].length; x++) {
        int c = m[x][y];
        m[x][y] = m[y][x];
        m[y][x] = c;
      }
    }
    return m;
  }
}
