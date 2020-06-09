package com.github.Mitictonylor.Files.fileManagement.components;

import com.github.Mitictonylor.Files.fileManagement.modules.File;
import com.github.Mitictonylor.Files.fileManagement.modules.Folder;
import com.github.Mitictonylor.Files.fileManagement.modules.User;
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

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User antonio = new User("Antonio");
        userRepository.save(antonio);

        User francesco = new User("Francesco");
        userRepository.save(francesco);

        User ciccillo = new User("Ciccillo");
        userRepository.save(ciccillo);

        Folder folder1 = new Folder ("documents", antonio);
        folderRepository.save(folder1);

        Folder folder2 = new Folder ("downloads", antonio);
        folderRepository.save(folder2);

        File file1 = new File("a","txt", 1234, folder1);
        fileRepository.save(file1);

        File file2 = new File("b","txt", 112356, folder1);
        fileRepository.save(file2);

        File file3 = new File("c","txt", 1234, folder2);
        fileRepository.save(file3);








    }
}
