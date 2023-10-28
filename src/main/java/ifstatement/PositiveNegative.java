package ifstatement;

public class PositiveNegative {
    public static void main(String[] args) {
        int c = -10;
        int e = 15;
        if (c < 0) {
            System.out.println("C is Negative");
        } else if (e > 0) {
            System.out.println("E is Positive");
        }

        int d = 0;
        if (d > 1) {
            System.out.println("D is Positive");
        } else if (d < -1) {
            System.out.println("D is Negative");
        } else {
            System.out.println("D is Zero");
        }

    }
}
