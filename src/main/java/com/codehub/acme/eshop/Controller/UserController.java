package com.codehub.acme.eshop.Controller;

import com.codehub.acme.eshop.domain.User;
import com.codehub.acme.eshop.service.UserService;
import com.codehub.acme.eshop.transformation.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> userList = userService.getAllUsers();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(userList);
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
    @PostMapping(value = "/users")
    public ResponseEntity<UserDto> addUser(@RequestBody User user){
        User userNew = userService.addUser(user);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(new UserDto(userNew.getId(), userNew.getUsername(), userNew.getPassword(), userNew.getName(), userNew.getSurname(), userNew.getEmail(), userNew.getPhoneNumber(), userNew.getAddress(), userNew.getPostCode(), null, userNew.getRole(), userNew.getToken()));
    }

    /**
     * This controllers removes a User {@link User} from the DB regarding a given userName
     * @param userName the username of user
     * @return {@link User}
     *
     */
    @DeleteMapping(value = "/users/remove/{userName}")
    public ResponseEntity deleteUserName (@PathVariable (name="userName") String userName){
        userService.removeUser(userName);
        return ResponseEntity.noContent().build();
    }

    /**
     * This controllers removes a User {@link User} from the DB regarding a given id
     * @param userId the user id
     * @return {@link User}
     *
     */
    @DeleteMapping(value = "/users/{userId}")
    public void deleteUserById(@PathVariable Long userId){
        userService.removeUserById(userId); }
}
