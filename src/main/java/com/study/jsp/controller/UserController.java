package com.study.jsp.controller;

import com.study.jsp.entity.User;
import com.study.jsp.service.UserService;
import com.study.jsp.utils.ValidateImageCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// 用户模块功能
@Controller
public class UserController {

    @Resource
    private UserService userService;

    //登录
    @RequestMapping("loginFunction")
    public String login(String username, String password, HttpSession session) throws UnsupportedEncodingException {
        System.out.println(username);
        System.out.println(password);
        try {
            //1. 执行登录业务逻辑
            User user = userService.login(username, password);
            session.setAttribute("user", user);
            //2. 登录成功，保存用户登录标记
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/login?msg=" + URLEncoder.encode(e.getMessage(), "UTF-8");
        }
        return "redirect:/list";
    }

    //用户注册
    //

    @RequestMapping("register")
    public String register(User user, String code, HttpSession session) throws UnsupportedEncodingException {
        System.out.println(code);
        System.out.println(user);
        try {
            // 1. 比较验证码是否一致
            if (!session.getAttribute("code").toString().equalsIgnoreCase(code)) throw new RuntimeException("验证码输入错误");
            userService.register(user);
        } catch (Exception e) {
            e.printStackTrace();
            return "redirect:/regist?msg=" + URLEncoder.encode(e.getMessage(), "UTF-8");
        }
        return "redirect:/login";
    }

//    生成验证码
    @RequestMapping("generateImageCode")
    public void generateImageCode(HttpSession session, HttpServletResponse response) throws IOException {
        //1. 生成随机字符串
        String code = ValidateImageCodeUtils.getSecurityCode();
        //2. 保存随机字符串到session
        session.setAttribute("code", code);
        //3. 将随机字符串生成图片
        response.setContentType("image/png"); //指定类型
        BufferedImage image = ValidateImageCodeUtils.createImage(code);
        //4. 通过response响应图片  通过响应方式输出
        ServletOutputStream os = response.getOutputStream();
        //调用工具类
        ImageIO.write(image,"png",os);

    }
}
