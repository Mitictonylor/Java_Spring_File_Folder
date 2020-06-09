package com.github.Mitictonylor.Files.fileManagement.repository;

import com.github.Mitictonylor.Files.fileManagement.modules.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
