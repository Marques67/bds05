package com.devsuperior.movieflix.repositories;


import com.devsuperior.movieflix.entitites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
