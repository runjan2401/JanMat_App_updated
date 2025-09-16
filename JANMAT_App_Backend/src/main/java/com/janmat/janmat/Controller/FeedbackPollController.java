package com.janmat.janmat.Controller;

import com.janmat.janmat.models.FeedbackPoll;
import com.janmat.janmat.Services.FeedbackPollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/feedback-polls")
@CrossOrigin("*")
public class FeedbackPollController {
	 @Autowired
	    private FeedbackPollService feedbackPollService;

	    @PostMapping
	    public FeedbackPoll createPoll(@RequestBody FeedbackPoll poll) {
	        return feedbackPollService.savePoll(poll);
	    }

	    @GetMapping
	    public List<FeedbackPoll> getAllPolls() {
	        return feedbackPollService.getAllPolls();
	    }

	    @GetMapping("/{id}")
	    public FeedbackPoll getPollById(@PathVariable Long id) {
	        return feedbackPollService.getPollById(id);
	    }

	    @PutMapping("/{id}")
	    public FeedbackPoll updatePoll(@PathVariable Long id, @RequestBody FeedbackPoll updatedPoll) {
	        return feedbackPollService.updatePoll(id, updatedPoll);
	    }

	    @DeleteMapping("/{id}")
	    public void deletePoll(@PathVariable Long id) {
	        feedbackPollService.deletePoll(id);
	    }
	}

