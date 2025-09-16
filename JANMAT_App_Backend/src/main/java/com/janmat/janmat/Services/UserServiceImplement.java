package com.janmat.janmat.Services;

import com.janmat.janmat.models.Users;
import com.janmat.janmat.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplement implements UserService {

	 @Autowired
	    private UserRepository usersRepository;

	    @Override
	    public Users saveUser(Users user) { 
	        return usersRepository.save(user);
	    }

	    @Override
	    public List<Users> getAllUsers() {
	        return usersRepository.findAll();
	    }

	    @Override
	    public Users getUserById(Long id) {
	        return usersRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Users updateUser(Long id, Users updatedUser) {
	        Users existing = usersRepository.findById(id).orElse(null);
	        if (existing != null) {
	            existing.setUsername(updatedUser.getUsername());
	            existing.setEmail(updatedUser.getEmail());
	            existing.setPassword(updatedUser.getPassword());
	            existing.setRole(updatedUser.getRole());
	            existing.setCreated_at(updatedUser.getCreated_at());
	            return usersRepository.save(existing);
	        }
	        return null;
	    }

	    @Override
	    public void deleteUser(Long id) {
	        usersRepository.deleteById(id);
	    }
}
