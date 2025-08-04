package org.javagenesis.exceptions;

import java.io.FileNotFoundException;

public class ExceptionHandling {

    /**
     * Exceptions                                Errors
     * -could be handled                        -couldn't be handled
     * for eg: /ByZero, NPE etc                 -for eg: laptop crashes,  out of memory error
     *                                           stack overflow error etc.
     * types of exceptions:
     * 1. compile-time / checked exceptions
     * 2. runtime / unchecked exceptions (indexOutOfBoundsExceptions, NPE etc)
     */

    public static void main(String[] args) {
        /**
         * In java first right part gets executed then left
         *
         */

        try{
            int[] arr = new int[5];
            arr[5] = 5/0;    //runtime exceptions cz we find them in runtime
//
//        }catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println(e.getMessage());
        }catch(Exception e){    //generic exception handler
            System.out.println(e.getMessage());
        }
    }

    /**
     * compile-time exception
     * throw is used inside the method to throw exception
     * throws is used in method's signature to let us know that the method throws the exception
     * (used with compile-time exc.)
     */
    public static void readFile(String filePath) throws FileNotFoundException{  //needs throws cz
        throw new FileNotFoundException("File Not Found Exception");  //Compile-time / Checked
    }

    public static void validateAge(String name){  //doesn't need throws cz
        throw new ArithmeticException("not ready for voting");   //throws a runtime exceptions
    }
}


class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }
}
