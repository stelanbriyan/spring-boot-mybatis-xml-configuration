package org.incosyz.config.resources;

import org.incosyz.config.entity.User;
import org.incosyz.config.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Stelan Briyan
 */
@RestController
@RequestMapping(value = "/user/")
public class UserAPI {

    private UserService userService;

    public List<User> findUsers(){
        return this.userService.findUsers();
    }

    public void saveUser(@RequestBody User user){
        this.userService.saveUser(user);
    }

}
