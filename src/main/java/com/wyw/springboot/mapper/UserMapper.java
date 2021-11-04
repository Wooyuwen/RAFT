package com.wyw.springboot.mapper;

import com.wyw.springboot.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

    List<User> getAll();

    User getById(Long id);

    void install(User user);

    void Update(User user);

    void delete(Long id);
}