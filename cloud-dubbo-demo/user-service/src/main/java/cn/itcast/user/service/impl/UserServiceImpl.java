package cn.itcast.user.service.impl;


import cn.itcast.user.service.UserService;
import cn.itcast.user.user.dubbo.domain.User;
import cn.itcast.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}
