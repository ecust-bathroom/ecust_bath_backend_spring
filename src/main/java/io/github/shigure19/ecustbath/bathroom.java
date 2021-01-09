package io.github.shigure19.ecustbath;
import java.util.ArrayList;

public class bathroom {
    int bathroomId;
    ArrayList<singleroom> singlerooms;
    String information;
    public bathroom(){
        this.bathroomId=11245;
        this.singlerooms=new ArrayList<singleroom>();
        this.information="6666666";
    }
    public int getBathroomId() {
        return bathroomId;
    }

    public ArrayList<singleroom> getSinglerooms() {
        return singlerooms;
    }

    public String getInformation() {
        return information;
    }
}
class singleroom {
    int singleroomid;
    boolean status;
    public singleroom(){
        this.singleroomid=1;
        this.status=false;
    }
    public int getSingleroomid() {
        return singleroomid;
    }

    public boolean getStatus(){
        return this.status;

    }
    public void setStatus(boolean a){
        this.status=a;
    }
}
