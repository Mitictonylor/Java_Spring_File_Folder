package com.github.Mitictonylor.Files.fileManagement.controller;

import com.github.Mitictonylor.Files.fileManagement.modules.Folder;
import com.github.Mitictonylor.Files.fileManagement.modules.User;
import com.github.Mitictonylor.Files.fileManagement.repository.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class FolderController {

    @Autowired
    FolderRepository folderRepository;


    //index route, all users
    @GetMapping(value = "/folders")
    public ResponseEntity<List<Folder>> getAllFolders(){
        return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
    }


    //show route, show a particular user
    @GetMapping(value = "/folders/{id}")
    public ResponseEntity getFolder(@PathVariable Long id){
        return new ResponseEntity(folderRepository.findById(id), HttpStatus.OK);
    }

    //create route, add a new instance of user in the db
    @PostMapping(value = "/folders")
    public ResponseEntity<Folder> addFolder(@RequestBody Folder folder){
        folderRepository.save(folder);
        return new ResponseEntity<>(folder, HttpStatus.CREATED);
    }
}
