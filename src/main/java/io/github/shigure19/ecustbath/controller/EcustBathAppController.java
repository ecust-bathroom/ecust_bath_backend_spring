package io.github.shigure19.ecustbath.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.github.shigure19.ecustbath.entity.Room;
import io.github.shigure19.ecustbath.entity.RoomMapper;
import io.github.shigure19.ecustbath.entity.User;
import io.github.shigure19.ecustbath.entity.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EcustBathAppController {
    @Autowired
    private RoomMapper roomMapper;
    @Autowired
    private UserMapper userMapper;
    @ResponseBody
    @RequestMapping("/helloworld")
    public String HelloWorld(){
        return "Hello world!";
    }
    @ResponseBody
    @RequestMapping("/getAllRoom")
    public List<Room> getAllRoom() {
        List<Room> b = null;
        try{
            /* 真正使用的时候这里编写业务代码 */
            b =roomMapper.selectList(null);
        }catch (Exception e){
            e.printStackTrace();
        }
        return b;
    }
    @ResponseBody
    @RequestMapping("/getOneRoom")
    public List<Room> getOneRoom(@RequestParam(name="bathroomId") int bathroomId) {
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
    @ResponseBody
    @RequestMapping("/setOneRoom")
    public void setOneRoom(@RequestParam(name="roomId") int roomId){
        try{
            QueryWrapper q = new QueryWrapper();
            q.eq("roomId",roomId);
            Room r=roomMapper.selectOne(q);
            r.setStatus(r.getStatus()==1?0:1);
            roomMapper.update(r,q);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @ResponseBody
    @RequestMapping("/setDefaultBathoomId")
    public void setDefaultBathroomId(@RequestParam(name="openId") String openId,@RequestParam(name="bathroomId") int bathroomId){
        try{
            QueryWrapper q = new QueryWrapper();
            q.eq("openId",openId);
            User u=userMapper.selectOne(q);
            u.setBathroomId(bathroomId);
            userMapper.update(u,q);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(@RequestParam(name="openId") String openId){
        User u=null;
        try{
            QueryWrapper q = new QueryWrapper();
            q.eq("openId",openId);
            u=userMapper.selectOne(q);
        }catch(Exception e){
            e.printStackTrace();
        }
        return u;
    }
}

