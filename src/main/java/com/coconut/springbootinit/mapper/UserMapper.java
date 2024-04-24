package com.coconut.springbootinit.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.coconut.springbootinit.model.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 86132
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2024-03-19 21:13:22
* @Entity com.coconut.springbootinit.model.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




