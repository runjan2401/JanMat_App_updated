package com.janmat.janmat.Repository;

import com.janmat.janmat.models.ComplaintsResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComplaintsResponseRepository extends JpaRepository<ComplaintsResponse, Long> {
    
}
