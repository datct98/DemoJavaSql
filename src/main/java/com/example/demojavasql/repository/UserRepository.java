package com.example.demojavasql.repository;

import com.example.demojavasql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "select * from User where email=? and phone =?", nativeQuery = true)
    User findUserByEmailAndPhone(String email, String phone);

    // Khi để là native qery -> câu query phải giống y như query trong db
    @Query(value = "select * from User where role_id =?", nativeQuery = true)
    List<User> findByRoleId(int roleId);
}
