package cn.no7player.service;

import cn.no7player.dao.UserDao;
import cn.no7player.bean.MineUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zl on 2015/8/27.
 */

@Service(value = "userService")
public class UserService {

    @Autowired
    private UserDao userDao;

    public MineUsers getUserInfo(){
        MineUsers Users=userDao.findOne(1);
        return Users;
    }

}
