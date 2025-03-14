package com.example.springbootsecurityjwtauthenticationandauthorization.repository;

import com.example.springbootsecurityjwtauthenticationandauthorization.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    Optional<User> findByUserEmail(String email);

    boolean existsByUserEmail(String email);


}
