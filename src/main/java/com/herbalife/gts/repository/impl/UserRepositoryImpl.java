package com.herbalife.gts.repository.impl;

import com.herbalife.gts.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl {

    @Autowired
    private CassandraTemplate cassendraTemplate;

    public List<User> getAll(){
        return cassendraTemplate.select("select ID, user_name from User", User.class);
    }
}
