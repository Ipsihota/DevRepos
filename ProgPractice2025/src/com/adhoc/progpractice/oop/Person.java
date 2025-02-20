package com.adhoc.progpractice.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

final public class Person {
     final private String name;
     final private Long mobNum;
     final private Date dob;
     final private Address addr;
     final private List<Person> familyMember;

    public Person(String name, Long mobNum, Date dob, Address addr, List<Person> familyMember) {
        this.name = name;
        this.mobNum = mobNum;
        this.dob = dob != null ? new Date(dob.getTime()):null;
        this.addr = addr != null ? new Address(addr.getStreetNo(), addr.getLandMark(), addr.getBuildDetails()): null;
        this.familyMember = familyMember!=null ? new ArrayList<>(): null;
    }


    public String getName() {
        return name;
    }

    public Long getMobNum() {
        return mobNum;
    }

    public Date getDob() {
        return dob != null ? new Date(dob.getTime()):null;
    }

    public Address getAddr() {
        return addr != null ? new Address(addr.getStreetNo(), addr.getLandMark(), addr.getBuildDetails()): null;
    }

    public List<Person> getFamilyMember() {
        return Collections.unmodifiableList(familyMember);
    }
}

