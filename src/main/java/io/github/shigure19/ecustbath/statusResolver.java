package io.github.shigure19.ecustbath;

import java.util.ArrayList;

public class statusResolver {
    int status;
    int max;
    public statusResolver(int status,int max){
        this.status=status;
        this.max=max;
    }
    public int[] getBathroomDetail(){
        String s=Integer.toBinaryString(this.status);
        if(s.length()<this.max){
            s="0"+s;
        }
        char[] c=s.toCharArray();
        int[] detail=new int[this.max];
        for(int i=0;i<this.max;i++){
            detail[i]=Integer.parseInt(String.valueOf(c[i]));
        }
        return detail;
    }
}
