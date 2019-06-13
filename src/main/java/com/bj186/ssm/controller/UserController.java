package com.bj186.ssm.controller;

import com.bj186.ssm.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
//http://localhost:8080/user user就会找到
//注解中标注为user的Controller类
@RequestMapping(value = "/user")
@SessionAttributes(value = {"sessionVal"},types={String.class})

public class UserController {

    @ModelAttribute("user")
    public User getUser(){
        User user=new User();
        user.setAge(22);
        user.setUsername("黄孟月");
//        user.setUid(1);
        return user;
    }


@RequestMapping("login")
public  String login(){ //方法名叫什么都可以
    System.out.println("view here...");
    //返回值表示视图的文件名
//    return  "/WEB-INF/jsp/user/login.jsp";
    return "user/login";
}
    @RequestMapping("register")
        public String register(){
        return "user/register";
        }

//modelMap:模型映射表对象，添加键值对。供jsp页面通过el表达式访问.通过参数说明
        @RequestMapping(value = "/session")
        public  String getSession(ModelMap modelMap){
        modelMap.put("sessionVal","admin");
//            System.out.println;
        return "user/session";
        }

        @RequestMapping(value = "/login/{id}")
        public String getId(@PathVariable("id") Integer id){
            System.out.println("id:"+id);
            return "user/login";
        }
//        获取请求参数
            @RequestMapping(value = "/login1")
        public String login(@RequestParam(name = "username",required = true,defaultValue = "黄雨曦") String username ){
                System.out.println("username:"+username);
        return "user/login";
        }
//        @RequestBody获取前端传递的数据

}


