package com.geekster.UserManagement.service;

import com.geekster.UserManagement.model.User;
import com.geekster.UserManagement.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public  String updateEmail(Integer id, String emailId) {
        List<User> originalList = getAllUsers();
        for(User u : originalList)
        {
            if(id.equals(u.getUserId()))
            {
                //originalList.remove(u);
                u.setUserEmail(emailId);
                //originalList.add(u);

                return "updated";
            }
        }

        return "id not found";
    }

    public List<User> getAllUsers() {
        return userRepo.getUsers();
    }

    public String createUsers(List<User> users) {
        List<User> originalList = getAllUsers();
        originalList.addAll(users);
        return "New users added";

    }

    public String createUser(User user) {
        List<User> originalList = getAllUsers();
        originalList.add(user);
        return "New user added";
    }

    public String removeUser(Integer id) {
        List<User> originalList = getAllUsers();
        for(User u : originalList)
        {
            if(id.equals(u.getUserId()))
            {
                originalList.remove(u);
                return "removed";
            }
        }
        return "Id not found";
    }
}
