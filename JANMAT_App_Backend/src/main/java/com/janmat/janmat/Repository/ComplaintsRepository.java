package com.janmat.janmat.Repository;

import com.janmat.janmat.models.Complaints;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintsRepository extends JpaRepository<Complaints, Long> {
    
}