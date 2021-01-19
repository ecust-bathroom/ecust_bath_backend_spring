package io.github.shigure19.ecustbath.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.github.shigure19.ecustbath.mapper.Room;
import io.github.shigure19.ecustbath.mapper.RoomMapper;
import io.github.shigure19.ecustbath.utils.ThreadUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomService {
    @Autowired
    private RoomMapper roomMapper;
    private static Logger logger = Logger.getLogger(RoomService.class);
    public List<Room> getAllRoom() {
        List<Room> b = null;
        try{
            b =roomMapper.selectList(null);

        }catch (Exception e){
            e.printStackTrace();
        }
        return b;
    }
    public List<Room> getOneRoom(int bathroomId) {
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
    public void setOneRoom(int roomId){
        try{
            QueryWrapper q = new QueryWrapper();
            q.eq("roomId",roomId);
            Room r=roomMapper.selectOne(q);
            r.setStatus(r.getStatus()==1?0:1);
            roomMapper.update(r,q);
        }catch (Exception e){
            e.printStackTrace();

        }
}}
