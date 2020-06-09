package com.github.Mitictonylor.Files.fileManagement.repository;

import com.github.Mitictonylor.Files.fileManagement.modules.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
