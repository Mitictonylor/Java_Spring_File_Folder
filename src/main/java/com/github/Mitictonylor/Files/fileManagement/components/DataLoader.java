package com.github.Mitictonylor.Files.fileManagement.components;

import com.github.Mitictonylor.Files.fileManagement.repository.FileRepository;
import com.github.Mitictonylor.Files.fileManagement.repository.FolderRepository;
import com.github.Mitictonylor.Files.fileManagement.repository.UserRepository;
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

    @Override
    public void run(ApplicationArguments args) throws Exception {

    }
}
