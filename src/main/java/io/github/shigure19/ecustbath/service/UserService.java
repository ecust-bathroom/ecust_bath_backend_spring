package io.github.shigure19.ecustbath.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import io.github.shigure19.ecustbath.mapper.User;
import io.github.shigure19.ecustbath.mapper.UserMapper;
import io.github.shigure19.ecustbath.utils.ThreadUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    private static Logger logger = Logger.getLogger(UserService.class);

    public void setDefaultBathroomId(String openId,int bathroomId){
        try{
            QueryWrapper q = new QueryWrapper();
            q.eq("openId",openId);
            User u=userMapper.selectOne(q);
            u.setBathroomid(bathroomId);
            userMapper.update(u,q);

        }catch(Exception e){
            e.printStackTrace();

        }
    }
    public User getUser(String openId){
        User u=null;
        try{
            QueryWrapper q = new QueryWrapper();
            q.eq("openId",openId);
            if(userMapper.selectCount(q)!=0){
                u=userMapper.selectOne(q);
            }else{
                u=new User();
                u.setOpenid(openId);
                userMapper.insert(u);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return u;
    }
}
