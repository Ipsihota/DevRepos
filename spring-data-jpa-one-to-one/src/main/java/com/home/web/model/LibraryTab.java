package com.home.web.model;

import jakarta.persistence.*;

@Entity
public class LibraryTab {

    @Id
    @GeneratedValue
    private int id;

    private  String bookName;

    // parent side
    @OneToOne(mappedBy = "libraryTab", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private AddressTab addressTab;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public AddressTab getAddressTab() {
        return addressTab;
    }

    public void setAddressTab(AddressTab addressTab) {
        this.addressTab = addressTab;
    }

}
