package cn.no7player.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.no7player.bean.MineUsers;

/**
 * Created by zl on 2015/8/27.
 */
@Transactional
@Repository
public interface UserDao  extends CrudRepository<MineUsers, Integer> {
}
