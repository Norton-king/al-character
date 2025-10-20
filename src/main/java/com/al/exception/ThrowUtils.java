package com.al.exception;
/**
 * 异常抛出判断
 */
public class ThrowUtils {
    public static void throwIf(boolean condition, RuntimeException  exception) {
        if (condition) {
            throw exception;
        }
    }

    public static void throwIf(boolean condition, ErrorCode errorCode) {
        throwIf(condition,new BusinessException(errorCode));
    }

    public static void throwIf(boolean condition, ErrorCode errorCode, String message) {
        throwIf(condition,new BusinessException(errorCode,message));
    }
}
