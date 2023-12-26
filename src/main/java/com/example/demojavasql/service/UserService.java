package com.example.demojavasql.service;

import com.example.demojavasql.entity.User;
import com.example.demojavasql.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void findUserByEmailAndPhone(String email, String phone){
        User user = userRepository.findUserByEmailAndPhone(email, phone);
        if(user!=null)
            System.out.println(user);
        else System.out.println("Không tìm thấy user id: ");
    }
}
