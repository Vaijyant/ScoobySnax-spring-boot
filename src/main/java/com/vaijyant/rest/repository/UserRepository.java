package com.vaijyant.rest.repository;

import com.vaijyant.rest.document.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Integer> {
}
