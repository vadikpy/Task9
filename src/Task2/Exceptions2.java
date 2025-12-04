package Task2;

public class Exceptions2 {

    public static void exCh(int value) {
        switch (value) {
            case 1:
                int result = 10/0;
                break;
            case 2:
                int[] array = {1, 2, 3};
                System.out.println(array[3]);
                break;
            default:
                System.out.println("No exception");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test 1 - ArithmeticException");
        try {
            exCh(1);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }finally {
            System.out.println("Finally part executed");
        }


        System.out.println("Test 2 - ArrayIndexOutOfBoundsException");
        try {
            exCh(2);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }finally {
            System.out.println("Finally part executed");
        }

        System.out.println("Test 3- No Exception");
        try {
            exCh(4);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }finally {
            System.out.println("Finally part executed");
        }
        }
    }

