package org.base.day5_exception;

/**
 * 运行时异常
 */
public class AgeIlleagleRuntimeException extends RuntimeException{
    public AgeIlleagleRuntimeException() {
    }

    public AgeIlleagleRuntimeException(String message) {
        super(message);
    }
}
