package com.home.web.controller;

import com.home.web.model.AddressTab;
import com.home.web.model.LibraryTab;
import com.home.web.repository.LibraryRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mylibraries")
public class MyLibraryController {

    @Autowired
    private  LibraryRepos libraryRepos;

    @PostMapping("/create")
    public LibraryTab create(@RequestBody LibraryTab libraryTab){
        return libraryRepos.save(libraryTab);
    }

    /**
     * Get call
     */



}
