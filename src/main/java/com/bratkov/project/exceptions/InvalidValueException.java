package com.bratkov.project.exceptions;

public class InvalidValueException extends Exception{
    public InvalidValueException (String message) {
        super ("Error! " + message);
    }
}
