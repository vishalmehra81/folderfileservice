package com.codeclan.example.folderfileservice.repository;

import com.codeclan.example.folderfileservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
