package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.User;
import com.codehub.acme.eshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    /**
     * {@link UserService}
     */

    @Autowired
    private UserService userService;

    /**
     * This Controller returns a List of Users from the DB
     * @return {@link User}
     */
    @GetMapping("/users")
    public List<User> userList() {
        return userService.getAllUsers();
    }

    @GetMapping( value = "/users/{userId}")
    public Optional<User> findById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    @PostMapping(value = "/users/new")
    public void addUser(@RequestBody User user){
       userService.addUser(user);
    }

    @DeleteMapping(value = "/users/remove/{userName}")
    public void deleteUserName (@PathVariable (name="userName") String userName){
        userService.removeUser(userName);
    }

    @DeleteMapping(value = "/users/removeById/{userId}")
    public void deleteUserById(@PathVariable (name="userId") Long userId){
        userService.removeUserById(userId);
    }

}
