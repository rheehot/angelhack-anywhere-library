package com.anglehack.anywhereLibrary.exception;

public abstract class CanHaveStatusException extends Error {
    private int status;
    private String message;

    public CanHaveStatusException(int status, String message) {
        super(message);
        this.status = status;
        this.message = message;
    }
}
