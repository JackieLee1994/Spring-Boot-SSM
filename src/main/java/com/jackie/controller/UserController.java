package com.jackie.controller;

import com.jackie.dao.UserMapper;
import com.jackie.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * Created by lwxzbh on 2017/7/20.
 */
@Controller
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    UserMapper userMapper;

    @RequestMapping("/cs")
    public @ResponseBody List<User> cs(){
        List<User> user = userMapper.selectUserByName("liwenxiang");
        /*User user = new User();
        user.setUsername("李");
        user.setId(10);
        user.setCustomerId(20313);
        user.setAge(23);*/
        logger.debug("这是debug信息");
        logger.info("这是info信息");
        logger.warn("这是warn信息");
        logger.error("这是error信息");
        return user;
    }
}
