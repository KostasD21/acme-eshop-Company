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
    /**
     * This controllers searches and returns a User {@link User} from the DB regarding a given Id
     * @return {@link User}
     */
    @GetMapping( value = "/users/{userId}")
    public Optional<User> findById(@PathVariable Long userId){
        return userService.getUserById(userId);
    }

    /**
     * This Controller adds/creates a User {@link User} to the DB
     * @param user
     */
    @PostMapping(value = "/users/new")
    public void addUser(@RequestBody User user){
       userService.addUser(user);
    }

    /**
     * This controllers removes a User {@link User} from the DB regarding a given userName
     * @param userName the username of user
     * @return {@link User}
     *
     */
    @DeleteMapping(value = "/users/remove/{userName}")
    public void deleteUserName (@PathVariable (name="userName") String userName){
        userService.removeUser(userName);
    }

    /**
     * This controllers removes a User {@link User} from the DB regarding a given id
     * @param userId the user id
     * @return {@link User}
     *
     */
    @DeleteMapping(value = "/users/removeById/{userId}")
    public void deleteUserById(@PathVariable (name="userId") Long userId){
        userService.removeUserById(userId);
    }

}
