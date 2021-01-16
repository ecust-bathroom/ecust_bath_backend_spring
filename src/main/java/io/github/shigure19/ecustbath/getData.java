package io.github.shigure19.ecustbath;

import java.util.List;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.github.shigure19.ecustbath.entity.Room;
import io.github.shigure19.ecustbath.entity.RoomMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class getData{
    @Autowired
    private static RoomMapper roomMapper;
    public static List<Room> getAllRoom() {
        List<Room> b = null;
        try{
            /* 真正使用的时候这里编写业务代码 */
            b =roomMapper.selectList(null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return b;
    }
    public static List<Room> getOneRoom(int bathroomId) {
        List<Room> r = null;
        try{
            QueryWrapper q = new QueryWrapper();
            q.eq("bathroomId",bathroomId);
            r=roomMapper.selectList(q);
        }catch (Exception e){
            e.printStackTrace();
        }
        return r;
    }
    public static void setOneRoom(int roomId){
        try{
            QueryWrapper q = new QueryWrapper();
            q.eq("roomId",roomId);
            Room r=roomMapper.selectOne(q);
            roomMapper.update(r,q);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
