package com.codeclan.example.folderfileservice.repository;

import com.codeclan.example.folderfileservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
