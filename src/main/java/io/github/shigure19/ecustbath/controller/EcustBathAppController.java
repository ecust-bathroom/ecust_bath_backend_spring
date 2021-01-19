package io.github.shigure19.ecustbath.controller;

import io.github.shigure19.ecustbath.mapper.Room;
import io.github.shigure19.ecustbath.mapper.User;
import io.github.shigure19.ecustbath.service.RoomService;
import io.github.shigure19.ecustbath.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api")
public class EcustBathAppController {
    @Autowired
    RoomService roomService;
    @Autowired
    UserService userService;
    @ResponseBody
    @RequestMapping("/getAllRoom")
    public List<Room> getAllRoom() {
        return roomService.getAllRoom();
    }
    @ResponseBody
    @RequestMapping("/getOneRoom")
    public List<Room> getOneRoom(@RequestParam(name="bathroomId") int bathroomId) {
        return roomService.getOneRoom(bathroomId);
    }
    @ResponseBody
    @RequestMapping("/setOneRoom")
    public void setOneRoom(@RequestParam(name="roomId") int roomId){
        roomService.setOneRoom(roomId);
    }
    @ResponseBody
    @RequestMapping("/setDefaultBathoomId")
    public void setDefaultBathroomId(@RequestParam(name="openId") String openId,@RequestParam(name="bathroomId") int bathroomId){
        userService.setDefaultBathroomId(openId, bathroomId);
    }
    @ResponseBody
    @RequestMapping("/getUser")
    public User getUser(@RequestParam(name="openId") String openId){
        return userService.getUser(openId);
    }
}

