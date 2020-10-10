package td2;

class exercice1 {
  /**
   * @param t un tableau
   * @return t en clair sous la forme {t[0], t[1], ...,t[n]}
   */
  public static String enClair(int[] t) {
    StringBuilder result = new StringBuilder("{");
    for (int i = 0; i < t.length; i++) {
      result.append(t[i]).append(i == t.length - 1 ? "" : ", ");
    }
    result.append("}");
    return result.toString();
  }

  /**
   * @param t   un tableau d'entier
   * @param val un entier
   * @return un entier iVal tel que t[iVal] == val si val est présente dans t -1 sinon
   */
  public static int indiceDe(int[] t, int val) {
    for (int i = 0; i < t.length; i++) {
      if (t[i] == val) return i;
    }
    return -1;
  }

  /**
   * @param t un tableau d'entier non vide
   * @return un entier iMax tel qu'aucun élément de t ne soit strictement supérieur à t[iMax]
   */
  public static int indiceDuMax(int[] t) {
    int max = t[0];
    int maxIndex = 0;
    for (int i = 0; i < t.length; i++) {
      if (t[i] > max) {
        max = t[i];
        maxIndex = i;
      }
    }
    return maxIndex;
  }

  /**
   * @param t un tableau d'entier non vide
   * @return un tableau identique à t sauf en au plus 2 places : le dernier élément et une occurence de la valeur maximale ayant été échangées
   * @implNote le tableau t doit rester inchangé
   */
  public static int[] lePlusGrandALaFin(int[] t) {
    return new int[0];
  }

  /**
   * @param b un booléen
   * @return une visualisation lisible de l’ensemble des indices i pour lesquels b[i] vaut true
   */
  public static String enClair(boolean[] b) {
//    Count true values
    int count = 0;
    for (boolean bValue : b) {
      if (bValue) count++;
    }
//    Store true values indexes
    int[] indexes = new int[count];
    int step = 0;
    for (int i = 0; i < b.length; i++) {
      if (b[i]) {
        indexes[step] = i;
        step++;
      }

    }
//    Return the string based on true values indexes array
    return enClair(indexes);
  }

}

