package com.bloggersadda.demo.repository;

import com.bloggersadda.demo.model.User;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findByUsername(String username);
}
