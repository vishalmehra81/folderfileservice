package com.codeclan.example.folderfileservice.repository;

import com.codeclan.example.folderfileservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
