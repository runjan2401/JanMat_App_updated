package com.janmat.janmat.Repository;

import com.janmat.janmat.models.Ministers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MinisterRepository extends JpaRepository<Ministers, Long> {
	
}
