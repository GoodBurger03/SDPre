public class Objective3Lab2 {
    public static void main(String[] args) {
        double side1, side2, result, hypotenuse;
        side1 = 10.0;
        side2 = 8.0;
        result = (side1 * side1) + (side2 * side2);
        hypotenuse = Math.sqrt(result);

        System.out.println(hypotenuse);
    }
}