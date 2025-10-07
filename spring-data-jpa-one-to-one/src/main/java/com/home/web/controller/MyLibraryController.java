package com.home.web.controller;

import com.home.web.model.AddressTab;
import com.home.web.model.LibraryTab;
import com.home.web.repository.LibraryRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mylibraries")
public class MyLibraryController {

    @Autowired
    private  LibraryRepos libraryRepos;

    /**
     * Create call
     */
    @PostMapping("/create")
    public LibraryTab create(@RequestBody LibraryTab libraryTab){
        return libraryRepos.save(libraryTab);
    }

    /**
     * Get all call
     */
    @GetMapping("/getall")
    public List<LibraryTab> getAllLibraryDtls(){
        return libraryRepos.findAll();
    }

    /**
     * Get by ID
     */
    @GetMapping("/get/{id}")
    public LibraryTab getByLibraryId(@PathVariable int id) {
        return libraryRepos.findById(id).get();
    }

    /**
     * Update by ID
     */

    @PutMapping("/update/{id}")
    public LibraryTab updateLibraryDtls(@PathVariable int id,
                                        @RequestBody LibraryTab updatedLibDtls) {
        LibraryTab libraryTab = libraryRepos.findById(id).orElseThrow();

        if (libraryTab != null) {
            libraryTab.setBookName(updatedLibDtls.getBookName());
        }

        return libraryRepos.save(libraryTab);
    }

    /**
     * Delete by ID
     */

    @DeleteMapping("/del/{id}")
    public void deleteLibDtlsByID(@PathVariable int id){
        libraryRepos.deleteById(id);
    }
}
