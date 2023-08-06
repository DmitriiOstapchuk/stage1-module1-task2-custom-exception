package com.epam.mjc;

/**
 * is thrown when there is no Student with such ID
 */
public class WrongStudentIdException extends IllegalArgumentException{

    public WrongStudentIdException (String message) {
        super(message);
    }

    public WrongStudentIdException (String message, Throwable cause) {
        super(message, cause);
    }
}
