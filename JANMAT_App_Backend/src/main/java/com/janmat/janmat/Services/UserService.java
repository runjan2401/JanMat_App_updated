package com.janmat.janmat.Services;


import com.janmat.janmat.models.Users;
import java.util.List;

public interface UserService {

    Users saveUser(Users user);  

    List<Users> getAllUsers();

    Users getUserById(Long id);

    Users updateUser(Long id, Users user);

    void deleteUser(Long id);
}
