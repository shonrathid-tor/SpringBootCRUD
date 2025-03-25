package com.konruksiam.CrudApi.services;

import com.konruksiam.CrudApi.entity.User;

import java.util.List;

public interface UserService {
        User save(User user);
        List<User> findAll() ;
        User findById(Integer id ) ;
        void deleteById(Integer id ) ;
}
