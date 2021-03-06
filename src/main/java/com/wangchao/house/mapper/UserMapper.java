package com.wangchao.house.mapper;

import com.wangchao.house.common.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "userMapper")
public interface UserMapper {

    List<User> selectUsers();
}
