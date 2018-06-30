public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        TriangleExercises triangleExercises = new TriangleExercises();
        triangleExercises.easiest();
        triangleExercises.drawHorizontalLine(8);
        triangleExercises.drawVerticalLine(3);
        triangleExercises.drawRightTriangle(3);

        System.out.println("----------------------------------");
        DiamondExercises diamondExercises = new DiamondExercises();
        diamondExercises.isoscelesTriangle(3);
        diamondExercises.diamond(3);
        diamondExercises.diamondWithName(3);

        System.out.println("----------------------------------");
        FizzBuzzExercise fizzBuzzExercise = new FizzBuzzExercise();
        fizzBuzzExercise.FizzBuzzExercise(16);

        System.out.println("----------------------------------");
        PrimeFactorsExercise primeFactorsExercise = new PrimeFactorsExercise();
        primeFactorsExercise.PrimeFactorsExercise(30);

    }
}
