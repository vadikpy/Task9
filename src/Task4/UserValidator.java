package Task4;

public class UserValidator {

    public static void validateUserData(int age, String email, String password)
            throws InvalidAgeException, InvalidEmailException, InvalidPasswordException {

        if (age < 18 || age > 120) {
            throw new InvalidAgeException("Age must be between 18 and 120. Your age: " + age);
        }

        if (!email.contains("@") || !email.contains(".")) {
            throw new InvalidEmailException("Invalid email format: " + email);
        }

        if (password.length() < 8) {
            throw new InvalidPasswordException("Password must be at least 8 characters. Your password: " + password.length());
        }

        System.out.println("User  validated successfully");
    }
}
