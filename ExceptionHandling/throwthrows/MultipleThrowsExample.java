package throwthrows;

import java.io.*;
import java.sql.*;

public class MultipleThrowsExample {

    static void show() throws IOException, ArithmeticException {

        if(true) {
            throw new IOException("IO problem");
        }
    }

    public static void main(String[] args) {

        try {
            show();
        }

        catch(IOException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}