package org.incosyz.config.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.incosyz.config.entity.User;

import java.util.List;

/**
 * @author Stelan Briyan
 */
@Mapper
public interface UserMapper {

    List<User> findUsers();

    void saveUser(User user);
}
