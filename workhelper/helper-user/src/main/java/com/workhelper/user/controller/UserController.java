package com.workhelper.user.controller;

import com.workhelper.user.dao.UserDao;
import com.workhelper.user.model.BaseUser;
import com.workhelper.log.service.LogService;
import com.workhelper.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    private UserService userService;
    @Autowired
    private LogService logService;

    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi()throws Exception{
        System.out.println("user调用成功");
        userService.user();
        List<BaseUser> baseUser = userDao.find("from BaseUser where id=?","0eeab1c4056711e8b986525400b05776");
//        System.out.println(baseUser.get(0).getAccount());
//        restTemplate.getForObject("http://helper-log/log",String.class);
//        logService.log();
        return null;
    }
}
