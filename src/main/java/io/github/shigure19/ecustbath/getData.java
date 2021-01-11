package io.github.shigure19.ecustbath;

import java.util.ArrayList;
import io.github.shigure19.ecustbath.bathroom;
import  io.github.shigure19.ecustbath.statusResolver;
public class getData{
    public static ArrayList<bathroom> getAllBathroom() {
        ArrayList<bathroom> a = new ArrayList<bathroom>();
        try{
            /* 真正使用的时候这里编写业务代码 */
            for(int i=0;i<5;i++){
                a.add(new bathroom());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return a;
    }

    public static bathroom getBathroomById(int bathroomId) {
        bathroom a = new bathroom();
        try{
            /* 真正使用的时候这里编写业务代码 */
        }catch (Exception e){
            e.printStackTrace();
        }
        return a;
    }
}
class hardwareData{
    public static bathroom getBathroomById(int bathroomId){
        try {
            int status = 0, max = 0;
            /*sql*/
            statusResolver sr = new statusResolver(status, max);
            return new bathroom(max, sr.getBathroomDetail());
        }catch (Exception e){
            e.printStackTrace();
            return new bathroom();
        }
    }
}
