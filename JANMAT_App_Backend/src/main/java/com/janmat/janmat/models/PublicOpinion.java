package com.janmat.janmat.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="PublicOpinion")
public class PublicOpinion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private Long opinion_id;
    
    @Column(unique = true, nullable = false)
    private Long user_id;
    
    @Column(unique = true, nullable = false)
    private Long minister_id;
   
    @Column(nullable = false)
    private String rating;
    
    @Column(nullable = false)
    private String comment;
    
    
    public PublicOpinion(Long opinion_id, Long user_id,Long minister_id,String rating,String comment) {
   	 
        this.opinion_id = opinion_id;
        this.user_id = user_id;
        this.minister_id= minister_id;
        this.rating = rating;
        this.comment = comment;
        }


	public Long getOpinion_id() {
		return opinion_id;
	}


	public void setOpinion_id(Long opinion_id) {
		this.opinion_id = opinion_id;
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


	public String getRating() {
		return rating;
	}


	public void setRating(String rating) {
		this.rating = rating;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


}
