package cn.no7player.controller;

import cn.no7player.bean.MineUsers;
import cn.no7player.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by zl on 2015/8/27.
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping("/getUserInfo")
    @ResponseBody
    public MineUsers getUserInfo() {
        MineUsers Users = userService.getUserInfo();
        if(Users!=null){
            System.out.println("Users.getName():"+Users.getUsername());
            logger.info("Users.getAge():"+Users.getAge());
        }
        return Users;
    }
}
