package ru.gurzhy;

/**
 * Thrown to indicate that the application has attempt to convert a String
 * to int type, but string does not have appropriate format.
 *
 */
public class MyArrayDataException extends Exception {

    /**
     * Constructs a <code>MyArrayDataException</code> with no detail message.
     */
    public MyArrayDataException() {
        super();
    }

    /**
     * Constructs a <code>MyArrayDataException</code> with the specified detail message.
     *
     * @param message the detail message
     */
    public MyArrayDataException(String message) {
        super(message);
    }









}
