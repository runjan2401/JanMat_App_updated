package com.janmat.janmat.Services;

import com.janmat.janmat.models.FeedbackPoll;
import com.janmat.janmat.Repository.FeedbackPollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackPollServiceImplement implements FeedbackPollService {

	@Autowired
    private FeedbackPollRepository feedbackPollRepository;

    @Override
    public FeedbackPoll savePoll(FeedbackPoll poll) {
        return feedbackPollRepository.save(poll);
    }

    @Override
    public List<FeedbackPoll> getAllPolls() {
        return feedbackPollRepository.findAll();
    }

    @Override
    public FeedbackPoll getPollById(Long id) {
        return feedbackPollRepository.findById(id).orElse(null);
    }

    @Override
    public FeedbackPoll updatePoll(Long id, FeedbackPoll updatedPoll) {
        FeedbackPoll existing = feedbackPollRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setUser_id(updatedPoll.getUser_id());
            existing.setMinister_id(updatedPoll.getMinister_id());
            existing.setQuestion(updatedPoll.getQuestion());
            existing.setResponse(updatedPoll.getResponse());
            existing.setTimestamp(updatedPoll.getTimestamp());
            return feedbackPollRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deletePoll(Long id) {
        feedbackPollRepository.deleteById(id);
    }
}