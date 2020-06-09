package com.github.Mitictonylor.Files.fileManagement.repository;

import com.github.Mitictonylor.Files.fileManagement.modules.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
