package com.request.validation.repository;

import com.request.validation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    /**
     * Notice the method name findByUserId - Here findBy and userId should be treated separately. If you write findBy
     * followed by field name then JPA will automatically understand that the end user is looking to find something
     * based on the given field name. In conclusion, findBy is Jpa inbuilt and userId is the field from the model class.
     */
    User findByUserId(Integer id);
}
