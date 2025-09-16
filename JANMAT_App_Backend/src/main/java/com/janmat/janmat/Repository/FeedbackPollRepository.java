package com.janmat.janmat.Repository;

import com.janmat.janmat.models.FeedbackPoll;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackPollRepository extends JpaRepository<FeedbackPoll, Long> {
    
}