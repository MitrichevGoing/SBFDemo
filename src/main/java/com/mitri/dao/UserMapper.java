package com.mitri.dao;

import com.mitri.po.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by mitrichev on 2016/12/6.
 */
@Mapper
public interface UserMapper {
    /**
     * 按用户id查询用户
     * @param userId
     * @return
     */
    @Select("select * from t_base_user where user_id = #{id}")
    User selectByUserId(@Param("id") Long userId);

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from t_base_user")
    List<User> selectAll();

    /**
     * 按用户姓名查询用户
     * @param userName
     * @return
     */
    @Select("select * from t_base_user where name_cn like '%'||#{name}||'%'")
    @ResultMap("UserMap")
    List<User> selectByUserName(@Param("name") String userName);
}
