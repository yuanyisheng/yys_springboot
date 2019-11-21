package com.yys.mapper;

import com.yys.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * 用户管理
 *      Mapper
 * @author yys
 */
public interface UserMapper {

    @Select("SELECT id, user_name AS name, age, status, create_time AS createTime, update_time AS updateTime FROM yys_user WHERE user_name = #{name}")
    UserEntity findByName(@Param("name") String name);

    @Insert("INSERT INTO yys_user VALUES (NULL, #{name}, #{age}, 1, NOW(), NOW())")
    int insert(@Param("name") String name, @Param("age") Integer age);

}
