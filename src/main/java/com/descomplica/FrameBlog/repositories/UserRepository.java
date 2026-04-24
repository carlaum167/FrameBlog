package com.descomplica.FrameBlog.repositories;


import com.descomplica.FrameBlog.modelos.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String login);
}
