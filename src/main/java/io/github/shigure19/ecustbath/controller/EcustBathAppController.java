package io.github.shigure19.ecustbath.controller;

import io.github.shigure19.ecustbath.entity.Room;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import io.github.shigure19.ecustbath.getData;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EcustBathAppController {
    @ResponseBody
    @RequestMapping("/helloworld")
    public String HelloWorld(){
        return "Hello world!";
    }
    @ResponseBody
    @RequestMapping("/getAllRoom")
    public List<Room> getAllRoomStatus(){
        return getData.getAllRoom();
    }
    @ResponseBody
    @RequestMapping("/getOneRoom")
    public List<Room> getOneRoom(@RequestParam(name="bathroomId") int bathroomId){
        return getData.getOneRoom(bathroomId);
    }
    @ResponseBody
    @RequestMapping("/setOneRoom")
    public void setOneRoom(@RequestParam(name="roomId") int roomId){
        getData.setOneRoom(roomId);
    }
}

