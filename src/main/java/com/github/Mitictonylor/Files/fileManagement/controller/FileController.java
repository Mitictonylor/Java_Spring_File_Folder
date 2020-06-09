package com.github.Mitictonylor.Files.fileManagement.controller;

import com.github.Mitictonylor.Files.fileManagement.modules.File;
import com.github.Mitictonylor.Files.fileManagement.modules.User;
import com.github.Mitictonylor.Files.fileManagement.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FileController {

    @Autowired
    FileRepository fileRepository;


    //index route, all users
    @GetMapping(value = "/files")
    public ResponseEntity<List<File>> getAllFiles(){
        return new ResponseEntity<>(fileRepository.findAll(), HttpStatus.OK);
    }


    //show route, show a particular user
    @GetMapping(value = "/files/{id}")
    public ResponseEntity getFile(@PathVariable Long id){
        return new ResponseEntity(fileRepository.findById(id), HttpStatus.OK);
    }

    //create route, add a new instance of user in the db
    @PostMapping(value = "/files")
    public ResponseEntity<File> addFile(@RequestBody File file){
        fileRepository.save(file);
        return new ResponseEntity<>(file, HttpStatus.CREATED);
    }
}
