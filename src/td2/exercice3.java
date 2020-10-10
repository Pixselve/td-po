package td2;

public class exercice3 {
  static final int n = 3;
  int[][] m = new int[n * n][n * n];

  public static int iCoin(int i) {
    return (i / n) * n < i ? i / n : i / n - 1;
  }

  public static int jCoin(int j) {
    return (j / n) * n < j ? j / n : j / n - 1;
  }
}
