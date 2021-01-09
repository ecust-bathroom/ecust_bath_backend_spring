package io.github.shigure19.ecustbath.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import io.github.shigure19.ecustbath.bathroom;
import io.github.shigure19.ecustbath.getData;

import java.util.ArrayList;

@Controller
public class EcustBathAppController {
    @ResponseBody
    @RequestMapping("/helloworld")
    public String HelloWorld(){
        return "Hello world!";
    }
    @ResponseBody
    @RequestMapping("/getAllBathroomStatus")
    public ArrayList<bathroom> getAllBathroomStatus(){
        return getData.getAllBathroom();
    }
    @ResponseBody
    @RequestMapping("/getBathroomById/")
    public bathroom getBathroomById(@RequestParam(name="bathroomId") int bathroomId){
        return getData.getBathroomById(bathroomId);
    }
}

