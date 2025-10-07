package com.home.web.model;

import jakarta.persistence.*;

@Entity
public class AddressTab {

    @Id
    private int id;

    private String country;
    private String zip;

    // child side
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "lib_ref_no", unique = true, nullable = true)
    private LibraryTab libraryTab;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public LibraryTab getLibraryTab() {
        return libraryTab;
    }

    public void setLibraryTab(LibraryTab libraryTab) {
        this.libraryTab = libraryTab;
    }
}
