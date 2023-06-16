package cn.itcast.user.service.service.impl;


import cn.itcast.user.service.domain.User;
import cn.itcast.user.service.mapper.UserMapper;
import cn.itcast.user.service.service.UserService;
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
