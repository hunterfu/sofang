package com.sofang.base.repository;

import com.sofang.base.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    /**
     * 通过用户名查询用户
     * @param username
     * @return
     */
    User findByName(String username);
}
