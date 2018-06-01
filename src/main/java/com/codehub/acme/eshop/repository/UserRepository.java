package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;



/**
 * This interface contains the signatures for the CRUD functionalities regarding {@link User}
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {


    /**
     * Search {@link User} by id
     * @param Id of the {@link User} to be searched
     * @return {@link User}
     */
    Optional <User> getUserById(Long Id);

    /**
     * Search {@link User} by username
     * @param username of the {@link User} to be searched
     * @return {@link User}
     */
    User findUserByUsername(String username);

    /**
     * Search {@link User} by mail
     * @param email of the {@link User} to be searched
     * @return {@link User}
     */
    List<User> findByEmail(String email);

    /**
     * Delete {@link User} by id
     * @param id of the {@link User} to be deleted
     */
    void deleteById(Long id);

    /**
     * Delete {@link User} by username
     * @param username of the {@link User} to be deleted
     */
    void deleteByUsername(String username);

    /**
     * Delete {@link User} by mail
     * @param email of the {@link User} to be deleted
     */
    void deleteByEmail(String email);

    /**
     * Check if {@link User} exists by id
     * @param id of the {@link User} to be checked
     * @return true/false
     */
    List<User> getById(Long id);

    /**
     * Check if {@link User} exists by username
     * @param username of the {@link User} to be checked
     * @return true/false
     */
    List<User> getByUsername(String username);

    /**
     * Get the list of {@link User}
     *
     */
    List<User> findAll();

    /**
     * This method a {@link User} finds by token
     *
     * @return {@link User}
     */
    User findByToken(String token);
}