package com.jonathnawill.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jonathnawill.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
