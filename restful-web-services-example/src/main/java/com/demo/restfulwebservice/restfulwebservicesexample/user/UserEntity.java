package com.demo.restfulwebservice.restfulwebservicesexample.user;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class UserEntity {

    @Id
    private Integer id;
    private String name;
    private Date birthDate;

    protected UserEntity(){}

    public UserEntity(Integer id, String name, Date birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
