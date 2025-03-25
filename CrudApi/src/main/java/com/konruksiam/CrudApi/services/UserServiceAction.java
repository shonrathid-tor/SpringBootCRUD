package com.konruksiam.CrudApi.services;

import com.konruksiam.CrudApi.entity.User;
import com.konruksiam.CrudApi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceAction implements UserService{
    private UserRepository userRepository ;

    @Autowired
    public UserServiceAction(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Integer id) {
        Optional<User> result= userRepository.findById(id) ;
        User data = null ;
        if (result.isPresent()){
            data = result.get() ;

        }else {
            throw new ResponseStatusException (HttpStatus.NOT_FOUND, "user not found") ;

        }
        return data ;
    }

    @Override
    public void deleteById(Integer id) {
        userRepository.deleteById(id) ;
    }


}
