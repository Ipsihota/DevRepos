package com.home.web.repository;

import com.home.web.model.AddressTab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepos extends JpaRepository<AddressTab, Integer> {
}
