package cn.itcast.user.service;


import cn.itcast.user.user.dubbo.domain.User;

public interface UserService {

    User queryById(Long id);
}
