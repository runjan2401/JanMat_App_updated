package com.janmat.janmat.Repository;

import com.janmat.janmat.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
    
}
