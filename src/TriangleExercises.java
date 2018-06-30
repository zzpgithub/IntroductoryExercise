public class TriangleExercises {

  public void easiest() {
    System.out.println("*");
  }

  public void drawHorizontalLine(int number) {
    if (number < 0) {
      return;
    }
    for (int i = 0; i < number; i++) {
      System.out.print("*");
    }
  }

  public void drawVerticalLine(int number) {
    if (number < 0) {
      return;
    }
    for (int i = 0; i < number; i++) {
      System.out.println("*");
    }
  }

  public void drawRightTriangle(int number) {
    if (number < 0) {
      return;
    }
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
