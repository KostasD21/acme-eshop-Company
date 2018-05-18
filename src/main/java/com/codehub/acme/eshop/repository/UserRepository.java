package com.codehub.acme.eshop.repository;

import com.codehub.acme.eshop.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.jws.soap.SOAPBinding;
import java.util.List;
import java.util.Optional;



/**
 * This interface contains the signatures for the CRUD functionalities regarding {@link User}
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    /**
     * Search {@link User} by username
     * @param username of the {@link User} to be searched
     * @return {@link User}
     */
    List<User> findByUserName(String username);

    /**
     * Search {@link User} by id
     * @param Id of the {@link User} to be searched
     * @return {@link User}
     */
    Optional<User> findById(Long Id);

    /**
     * Search {@link User} by mail
     * @param mail of the {@link User} to be searched
     * @return {@link User}
     */
    List<User> findByMail(String mail);

    /**
     * Delete {@link User} by id
     * @param id of the {@link User} to be deleted
     */
    void deleteById(Long id);

    /**
     * Delete {@link User} by username
     * @param username of the {@link User} to be deleted
     */
    void deleteByUserName(String username);

    /**
     * Delete {@link User} by mail
     * @param mail of the {@link User} to be deleted
     */
    void deleteByMail(String mail);

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
    List<User> getByUserName(String username);
}
