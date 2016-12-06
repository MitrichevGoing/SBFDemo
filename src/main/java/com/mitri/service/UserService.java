package com.mitri.service;

import com.mitri.po.model.UserModel;

import java.util.List;

/**
 * Created by mitrichev on 2016/12/6.
 */
public interface UserService {
    /**
     * 根据userId查询User
     * @param userId
     * @return
     */
    UserModel selectByUserId(Long userId);

    /**
     * 查询所有用户
     * @return
     */
    List<UserModel> selectAll();

    /**
     * 按用户姓名查询
     * @param userName
     * @return
     */
    List<UserModel> selectByNameCn(String userName);
}
