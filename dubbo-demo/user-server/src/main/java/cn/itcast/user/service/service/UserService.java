package cn.itcast.user.service.service;


import cn.itcast.user.service.domain.User;

public interface UserService {

    User queryById(Long id);
}
