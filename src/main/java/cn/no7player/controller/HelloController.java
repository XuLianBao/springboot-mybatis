package cn.no7player.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

import cn.no7player.bean.MineUsers;
import cn.no7player.service.UserService;

@Controller
public class HelloController {
    @Resource(name = "userService")
    UserService userService;

    @RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        String names =userService.getUserInfo().getUsername();
        model.addAttribute("name", names);
        return "hello";
    }
    
}
