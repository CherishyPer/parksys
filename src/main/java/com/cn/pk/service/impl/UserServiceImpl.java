package com.cn.pk.service.impl;

import javax.annotation.Resource;
import com.cn.pk.entity.User;
import com.cn.pk.dao.IUserDao;
import com.cn.pk.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService") 
public class UserServiceImpl implements IUserService {
	@Resource  
    private IUserDao userDao;  
    @Override  
    public User getUserById(int userId) {  
        // TODO Auto-generated method stub  
        return this.userDao.selectByPrimaryKey(userId);
    }
}
