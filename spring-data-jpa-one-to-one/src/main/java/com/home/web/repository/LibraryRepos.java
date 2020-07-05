package com.home.web.repository;

import com.home.web.model.LibraryTab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibraryRepos extends JpaRepository<LibraryTab, Integer> {
}
