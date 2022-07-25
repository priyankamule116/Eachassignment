package com.capg.security;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends MongoRepository<AppUser,Integer>{
   public AppUser findByUserName(String userName);
}
