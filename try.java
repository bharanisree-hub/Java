public class ExceptionDemo {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age Must be at least 18.");
        } else {
            System.out.println("Access granted!");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(15); 
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught an error: " + e.getMessage());
        } 
        finally {
            System.out.println("Validation check complete.");
        }
    }
}
