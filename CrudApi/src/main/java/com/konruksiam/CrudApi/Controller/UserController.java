package com.konruksiam.CrudApi.Controller;

import com.konruksiam.CrudApi.entity.User;
import com.konruksiam.CrudApi.repository.UserRepository;
import com.konruksiam.CrudApi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;


@RestController
@RequestMapping("/api")
public class UserController {

   private UserService userService ;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user ){
        user.setId(0);
        userService.save(user) ;

        return userService.save(user) ;
    }
    @GetMapping("/users")
    public List<User> getAllUser(){

        return userService.findAll();
    }

    @GetMapping("/user/{id}")
    public User getUserID (@PathVariable int id ){
        User myUser = userService.findById(id);
        if (myUser == null ){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "USER  not found" // return 404 not found ;
            );
        }
        return myUser ;
    }
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id){
        User myUser = userService.findById(id) ;
        if(myUser == null ){
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "USER not found") ;
        }else {
            userService.deleteById(id);
            return "DELETED ID :  "+ id +" "+ "COMPLETED " ;

        }

    }
    @PutMapping("/users")
    public User updateUser(@RequestBody User user ){



        return userService.save(user) ;
    }



}
