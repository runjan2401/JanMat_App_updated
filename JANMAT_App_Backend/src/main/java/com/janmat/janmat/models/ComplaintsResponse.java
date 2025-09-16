package com.janmat.janmat.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "compliants")
public class ComplaintsResponse {
	 public ComplaintsResponse() {
  	                                    
     }
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long complaint_id;
     
     @Column(unique = true, nullable = false)
     private Long user_id;
    
     @Column(nullable = false)
     private Long minister_id;
     
     @Column(nullable = false)
     private String response;
     
     
     public ComplaintsResponse(Long complaint_id, Long user_id,Long minister_id,String response) {
  	   
         this.complaint_id = complaint_id;
         this.user_id = user_id;
         this.minister_id = minister_id;
         this.response = response;
         
         }


	public Long getComplaint_id() {
		return complaint_id;
	}


	public void setComplaint_id(Long complaint_id) {
		this.complaint_id = complaint_id;
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


	public String getResponse() {
		return response;
	}


	public void setResponse(String response) {
		this.response = response;
	}
}
