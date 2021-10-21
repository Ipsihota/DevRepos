package com.demo.restfulwebservice.restfulwebservicesexample.dao;

import com.demo.restfulwebservice.restfulwebservicesexample.exception.UserNotFoundException;
import com.demo.restfulwebservice.restfulwebservicesexample.user.UserEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Component
public class UserDaoService {
    private static List<UserEntity> usrList = new ArrayList<>();
    private static int usrCount = 3;
    static {
        usrList.add(new UserEntity(1, "Jack", new Date()));
        usrList.add(new UserEntity(2, "Jill", new Date()));
        usrList.add(new UserEntity(3, "Tom", new Date()));
    }

    // save users
    public UserEntity saveUsers(UserEntity users){
        if(users.getId() == null){
          users.setId(++usrCount);
        }
        usrList.add(users);
        return users;
    }


    // find all users
    public List<UserEntity> getAllUserList(){
        return usrList;
    }

    // find user by id
    public UserEntity findUserById(int userId){
        for (UserEntity usr: usrList) {
            if (usr.getId() == userId){
                return usr;
            }
        }
        return null;
    }

    // Delete user by id
    public UserEntity deleteUserById(int userId){
        Iterator<UserEntity> usrItr = usrList.iterator();
        while(usrItr.hasNext()) {
            UserEntity usr = usrItr.next();
            if (usr.getId() == userId){
                usrItr.remove();
                return usr;
            }
        }
        return null;
    }
}
