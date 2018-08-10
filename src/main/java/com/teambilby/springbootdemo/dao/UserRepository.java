package com.teambilby.springbootdemo.dao;

import org.springframework.data.repository.CrudRepository;
import com.teambilby.springbootdemo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {
}
