package com.codeclan.example.folderfileservice.components;

import com.codeclan.example.folderfileservice.models.File;
import com.codeclan.example.folderfileservice.models.Folder;
import com.codeclan.example.folderfileservice.models.User;
import com.codeclan.example.folderfileservice.repository.FileRepository;
import com.codeclan.example.folderfileservice.repository.FolderRepository;
import com.codeclan.example.folderfileservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        User user1 = new User("Nikunj Sahay");
        userRepository.save(user1);
        User user2 = new User("Rahul Khanna");
        userRepository.save(user2);
        Folder folder1 = new Folder("Python Docs", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("HTML&CSS", user1);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("JavaScript", user2);
        folderRepository.save(folder3);
        File file1=new File("Vue.js", ".doc", 5, folder3);
        fileRepository.save(file1);
        File file2=new File("DOM", ".pdf", 9, folder3);
        fileRepository.save(file2);
        File file3=new File("HTML Attributes", ".pdf", 3, folder2);
        fileRepository.save(file3);
        File file4=new File("Classes", ".doc", 10, folder1);
        fileRepository.save(file4);
        user1.addFolder(folder1);
        user1.addFolder(folder2);
        user2.addFolder(folder3);
        userRepository.save(user1);
        userRepository.save(user2);
        folder1.addFile(file1);
        folder1.addFile(file2);
        folder2.addFile(file3);
        folder3.addFile(file4);
        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);

    }
    }



