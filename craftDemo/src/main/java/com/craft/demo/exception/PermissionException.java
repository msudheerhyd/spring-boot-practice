package com.craft.demo.exception;

public class PermissionException extends  RuntimeException {
    public  PermissionException(String msg) {
        super("You are not allowed to perform this operation" + msg);
    }
}
