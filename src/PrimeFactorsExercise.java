public class PrimeFactorsExercise {

  static boolean prime(int n) {
    for (int i = 2; i <= n / 2; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public void PrimeFactorsExercise(int number) {
    int i = 2;
    while (i <= number) {
      if ((number % i == 0) && prime(i)) {
        System.out.println(i);
        number = number / i;
        continue;
      }
      i++;
    }
  }
}
