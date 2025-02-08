package com.example.bootcamp.repository;

import com.example.bootcamp.entity.Authority;
import com.example.bootcamp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByCenterIdAndAuthorities(Long center_id, Authority authorities);

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
