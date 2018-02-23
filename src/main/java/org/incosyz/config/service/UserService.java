package org.incosyz.config.service;

import org.incosyz.config.entity.User;
import org.incosyz.config.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Stelan Briyan
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findUsers() {
        return this.userMapper.findUsers();
    }

    public void saveUser(User user) {
        this.userMapper.saveUser(user);
    }
}
