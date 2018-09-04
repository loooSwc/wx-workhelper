package com.workhelper.user.controller;

import com.workhelper.user.dao.UserDao;
import com.workhelper.user.model.BaseUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserDao userDao;
    @Value("${test}")
    String foo;
    @RequestMapping(value = "/hi")
    public String hi(){
        List<BaseUser> baseUser = userDao.find("from BaseUser where id=?","0eeab1c4056711e8b986525400b05776");
        System.out.println(baseUser.get(0).getAccount());
        return foo;
    }
}