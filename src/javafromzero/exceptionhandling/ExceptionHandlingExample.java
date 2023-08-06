package javafromzero.exceptionhandling;


import java.io.*;

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        try {
            readFromFile("nonexistent.txt");
        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }

    public static int divide(int dividend, int divisor) throws ArithmeticException, CustomException {
        try {
            if (divisor == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return dividend / divisor;
        } catch (ArithmeticException e) {
            throw e;
        } finally {
            System.out.println("Division operation attempted.");
        }
    }

    public static void readFromFile(String filePath) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new IOException("File not found: " + filePath);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw e;
                }
            }
        }
    }
}

