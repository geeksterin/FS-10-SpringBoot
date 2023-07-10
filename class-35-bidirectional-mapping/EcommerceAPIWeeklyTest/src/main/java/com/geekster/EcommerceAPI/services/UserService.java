package com.geekster.EcommerceAPI.services;

import com.geekster.EcommerceAPI.models.Product;
import com.geekster.EcommerceAPI.models.Users;
import com.geekster.EcommerceAPI.repos.IUserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    public String addUsers(List<Users> usersList) {
        List<Users> list = userRepo.saveAll(usersList);

        if(list==null){
            return "Users not added successfully";
        }else{
            return "Users added successfully";
        }
    }

    public Users getUser(Integer userID) {
        Optional<Users>  optionalUser = userRepo.findById(userID);

        if(optionalUser.isEmpty()){
            throw new IllegalStateException("UserID not found");
        }else{
            return optionalUser.get();
        }
    }
}
