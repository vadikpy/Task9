package Task1;

class Main {
    public static void exMethod() {
        String str = null;
        // This will throw NullPointerException
        System.out.println(str.length());
    }

    public static void main(String[] args) {
        try {
            exMethod();
        } catch (NullPointerException e) {
            System.out.println("=== NullPointerException Caught ===");
            System.out.println("Exception message: " + e.toString());
            System.out.println("\n=== Stack Trace ===");
            e.printStackTrace();
        }
    }
}

