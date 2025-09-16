package com.janmat.janmat.Services;

import com.janmat.janmat.models.FeedbackPoll;
import java.util.List;

public interface FeedbackPollService {
	FeedbackPoll savePoll(FeedbackPoll poll);
    List<FeedbackPoll> getAllPolls();
    FeedbackPoll getPollById(Long id);
    FeedbackPoll updatePoll(Long id, FeedbackPoll updatedPoll);
    void deletePoll(Long id);
}

