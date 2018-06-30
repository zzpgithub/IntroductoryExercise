public class DiamondExercises {
  public void isoscelesTriangle(int number) {
    if(number <= 0) {return;}
    for(int i = 0; i < number; i++){
      for (int j = 0; j < number-1-i; j++){
        System.out.print(" ");
      }
      for(int k = 0; k < 2*i+1; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public void diamond(int number) {
    if (number <= 0) {
      return;
    }
    for (int i = 0; i < number; i++) {
      for (int j = 0; j < number - 1 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    for (int i = number - 2; i >= 0; i--) {
      for (int j = 0; j < number - 1 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }

  public void diamondWithName(int number) {
    if (number <= 0) {
      return;
    }
    for (int i = 0; i < number - 1; i++) {
      for (int j = 0; j < number - 1 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
    System.out.println("Bill");

    for (int i = number - 2; i >= 0; i--) {
      for (int j = 0; j < number - 1 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println("");
    }
  }
}
