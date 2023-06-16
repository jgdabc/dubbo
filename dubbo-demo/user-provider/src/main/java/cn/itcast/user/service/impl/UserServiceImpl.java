package cn.itcast.user.service.impl;


import cn.itcast.user.domain.User;
import cn.itcast.user.service.UserService;
import cn.itcast.user.service.mapper.UserMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;

@DubboService
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
        return userMapper.findById(id);
    }
}
