package com.anglehack.anywhereLibrary.exception;

public class UnauthorizedException extends CanHaveStatusException {

    public UnauthorizedException(){
        this("Unauthorized Exception");
    }
    public UnauthorizedException(String message) {
        super(401, message);
    }
}
