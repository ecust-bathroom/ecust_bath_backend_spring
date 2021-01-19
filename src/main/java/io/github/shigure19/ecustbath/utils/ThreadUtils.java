package io.github.shigure19.ecustbath.utils;

public class ThreadUtils {
    public static String getMethodName(){
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
