package BooleanTest;

public class BooleanTest {

    public static void main(String[] args) {
        int one = 5, two = 10;
        if (isValid(one)) {    // checks if variable "one" is valid according to boolean test below (since isValid method is being described below)
            System.out.println("Valid!");
        }
    }
    public static boolean isValid(int num) {
        return num >= 1 && num <= 100;
    }
}
