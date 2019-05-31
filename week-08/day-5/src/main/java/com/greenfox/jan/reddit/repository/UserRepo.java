package com.greenfox.jan.reddit.repository;

import com.greenfox.jan.reddit.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, String> {
}
