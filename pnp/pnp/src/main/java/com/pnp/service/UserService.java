package com.pnp.service;

import java.util.Optional;

import com.pnp.model.User;

public interface UserService {

    Optional<User> findByUsername(String username);

    Optional<User> findByEmail(String email);

    User saveUser(User user);

}
