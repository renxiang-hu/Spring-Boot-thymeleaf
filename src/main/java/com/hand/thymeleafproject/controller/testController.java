package com.hand.thymeleafproject.controller;

import com.hand.thymeleafproject.domail.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class testController {

    @RequestMapping("/user")
    public String test(Model model) {
        List<User> list = new ArrayList<>();
        User user = new User("胡仁祥", "男", "1897444@qq.com", "江苏省盐城市");
        User user1 = new User("蔡瑶", "女", "222444@qq.com", "上海杨浦");
        User user2 = new User("科比", "男", "3337444@qq.com", "美国洛杉矶");
        User user3 = new User("詹姆斯", "男", "555444@qq.com", "美国达拉斯");
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        model.addAttribute("userList", list);
        return "users";

    }
}