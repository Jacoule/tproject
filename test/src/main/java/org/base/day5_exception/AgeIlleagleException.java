package org.base.day5_exception;

/**
 * 必须继承 Exception 才能成为一个编译时异常
 */
public class AgeIlleagleException extends Exception{
    public AgeIlleagleException() {
    }

    public AgeIlleagleException(String message) {
        super(message);
    }
}
