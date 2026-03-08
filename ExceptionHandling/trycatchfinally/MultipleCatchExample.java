package trycatchfinally;

public class MultipleCatchExample {
    public static void main(String[] args) {

        try {
            int arr[] = {10,20,30};

            System.out.println(arr[5]);   // ArrayIndexOutOfBounds
            int result = 10/0;            // ArithmeticException
            System.out.println(result);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic error occurred");
        }

        catch (Exception e) {
            System.out.println("General exception handled");
        }
    }
}