package com.mitri.serviceImp;

import com.mitri.base.common.BaseService;
import com.mitri.dao.UserMapper;
import com.mitri.po.bean.User;
import com.mitri.po.model.UserModel;
import com.mitri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mitrichev on 2016/12/6.
 */
@Service
public class UserServiceImpl extends BaseService implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserModel selectByUserId(Long userId) {
        User user = userMapper.selectByUserId(userId);
        return (UserModel) copyProperties(user, UserModel.class);
    }

    @Override
    public List<UserModel> selectAll() {
        List<User> list = userMapper.selectAll();
        return (List<UserModel>) copyListProperties(list,UserModel.class);
    }

    @Override
    public List<UserModel> selectByNameCn(String userName) {
        List<User> userS = userMapper.selectByUserName(userName);
        return (List<UserModel>) copyListProperties(userS,UserModel.class);
    }
}
