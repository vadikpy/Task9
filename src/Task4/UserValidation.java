package Task4;
public class UserValidation {
    public static void main(String[] args) {

        System.out.println("Test 1 - Invalid Age");
        try {
            UserValidator.validateUserData(15, "user@vistula.com", "password123");
        } catch (InvalidAgeException | InvalidEmailException | InvalidPasswordException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Test 2 - Invalid email");
        try {
            UserValidator.validateUserData(25, "invalidemail", "password123");
        } catch (InvalidAgeException | InvalidEmailException | InvalidPasswordException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Test 3 - Invalid Password");
        try {
            UserValidator.validateUserData(25, "user@example.com", "pass123");
        } catch (InvalidAgeException | InvalidEmailException | InvalidPasswordException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Test 4 - Valid Data");
        try {
            UserValidator.validateUserData(25, "user@example.com", "password123");
        } catch (InvalidAgeException | InvalidEmailException | InvalidPasswordException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

