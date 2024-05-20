package com.lucas.workshopcursejava.repositories;

import com.lucas.workshopcursejava.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
