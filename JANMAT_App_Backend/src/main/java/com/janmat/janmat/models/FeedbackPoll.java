package com.janmat.janmat.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "feedbackPoll")
       public class FeedbackPoll {
        public FeedbackPoll(){}    

       @Id
       @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long poll_id;

        @Column(unique = true, nullable = false)
         private Long user_id;

         @Column(nullable = false)
         private Long minister_id;

         @Column(nullable = false)
         private String question;
         
         @Column(nullable = false)
         private String response;
         
         @Column(nullable = false)
         private String timestamp;


public FeedbackPoll(Long poll_id, Long user_id,Long minister_id,String question,String response,String timestamp) {
	   
    this.poll_id = poll_id;
    this.user_id = user_id;
    this.minister_id = minister_id;
    this.response = response;
    this.question = question;
    this.timestamp = timestamp;
    }


public Long getPoll_id() {
	return poll_id;
}


public void setPoll_id(Long poll_id) {
	this.poll_id = poll_id;
}


public Long getUser_id() {
	return user_id;
}


public void setUser_id(Long user_id) {
	this.user_id = user_id;
}


public Long getMinister_id() {
	return minister_id;
}


public void setMinister_id(Long minister_id) {
	this.minister_id = minister_id;
}


public String getQuestion() {
	return question;
}


public void setQuestion(String question) {
	this.question = question;
}


public String getResponse() {
	return response;
}


public void setResponse(String response) {
	this.response = response;
}


public String getTimestamp() {
	return timestamp;
}


public void setTimestamp(String timestamp) {
	this.timestamp = timestamp;
}


}  