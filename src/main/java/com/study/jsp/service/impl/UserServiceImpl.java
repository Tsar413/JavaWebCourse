package com.study.jsp.service.impl;

import com.study.jsp.dao.UserDAO;
import com.study.jsp.entity.User;
import com.study.jsp.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    public UserDAO userDAO;

    @Override
    public void register(User user) {
        //1. 查询数据库是否存在该用户名
        //2. 如果存在报错，用户名已存在
        //3. 如果不存在则进行注册
        User findUser = userDAO.findByUsername(user.getUsername());
        if(findUser != null) throw new RuntimeException("用户名已存在");
        user.setId(userDAO.findBiggestUserId());
        //给明文密码加密
        String newPassword = DigestUtils.md5DigestAsHex(user.getPassword().getBytes(StandardCharsets.UTF_8));
        user.setPassword(newPassword);
        userDAO.save(user);
    }

    @Override
    public User login(String username, String password) {
        //1. 根据用户输入用户名查询数据中是否存在
        User findUser = userDAO.findByUsername(username);
        //2. 判断用户是否存在
        if(findUser == null) throw new RuntimeException("用户名不存在");
        //3. 判断密码的正确性
        if (!DigestUtils.md5DigestAsHex(password.getBytes(StandardCharsets.UTF_8)).equals(findUser.getPassword())) throw new RuntimeException("密码错误");
        return findUser;
    }
}
