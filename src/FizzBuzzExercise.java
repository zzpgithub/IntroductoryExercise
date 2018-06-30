public class FizzBuzzExercise {

  public void FizzBuzzExercise(int number) {
    if (number < 3) {
      return;
    }
    for (int i = 1; i <= number; i++) {
      if (i % 3 == 0) {
        if (i % 5 == 0) {
          System.out.println("FizzBuzz");
        } else {
          System.out.println("Fizz");
        }
      } else if (i % 5 == 0) {
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
