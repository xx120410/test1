package com.xx.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.deploy.net.HttpResponse;
import com.xx.demo.entity.Hello;
import com.xx.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RequestMapping("/helloController")
@Controller
public class HelloController extends HttpServlet {

    /**
    * @param username: 用户名
     * @param password: 密码
     * @author sss
     * @date 2022/1/10 17:19
     * 登录功能
    **/
    @ResponseBody
    @RequestMapping("/ceShi")
    public String ceShi(String username,String password,HttpSession session) throws JsonProcessingException {
//        Hello hello = new Hello();
//        try {
//            Hello.clone1();
//            hello.setXm("世界");
//            hello.setNl(60);
//            hello.setSj(new Date());
//            return hello;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
////            Hello hello = Hello.class.getConstructor().newInstance();
//            Hello hello = (Hello) super.clone();
//            hello.setXm("世界");
//            hello.setNl(60);
//            hello.setSj(new Date());
//            return hello;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        session.setAttribute("user",new User(username,password));
        session.setMaxInactiveInterval(10);
        Object user = session.getAttribute("user");
        Hello hello = getHello();
        ObjectMapper om = new ObjectMapper();
        String s = om.writeValueAsString(hello);
        System.out.println(username+"--"+password);
        System.out.println(session.getAttribute("user"));
        return s;
    }

    private Hello getHello() {
        Hello hello = null;
        try {
            hello = Hello.class.newInstance();
            hello.setXm("世界");
            hello.setNl(60);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            Date date = new Date();
            String format = simpleDateFormat.format(date);
            hello.setSj(format);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return hello;
    }

    /**
     * @author 张三
     * @date 2022/1/10 14:19
     *登录
    */
    @RequestMapping("/login")
    public String login(HttpServletResponse response,HttpServletRequest request){
//        Cookie cookie = new Cookie("ssss","tttttssss");
//        httpResponse.addCookie(cookie);
        HttpSession session = request.getSession();
        System.out.println(session.getId());
        return "login";
    }

    /**
     * @param args:
     * @author 张三
     * @date 2022/1/18 10:39
     *
    */
    public static void main(String[] args) {
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString());
        String uu = UUID.randomUUID().toString().replace("-","");
        System.out.println(uu);
    }

}
