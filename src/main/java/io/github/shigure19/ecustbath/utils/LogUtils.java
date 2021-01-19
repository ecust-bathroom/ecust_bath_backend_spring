package io.github.shigure19.ecustbath.utils;

import io.github.shigure19.ecustbath.service.RoomService;
import org.apache.log4j.Logger;

import java.util.Date;

public class LogUtils {
    private static Logger logger = Logger.getLogger(LogUtils.class);
    public static void log(String level,String operation){
        if(level=="debug"){
            logger.debug(String.valueOf(System.currentTimeMillis())+operation);
        }
    }
}
