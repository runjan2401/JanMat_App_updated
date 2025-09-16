package com.janmat.janmat.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "compliants")
public class Complaints {
           public Complaints() {}
           @Id
           @GeneratedValue(strategy = GenerationType.IDENTITY)
           private Long complaint_id;
           
           @Column(unique = true, nullable = false)
           private Long user_id;
          
           @Column(nullable = false)
           private Long project_id;
           
           @Column(nullable = false)
           private Long area_pincode;
           
           @Column(nullable = false)
           private String subject;
           
           @Column(nullable = false)
           private String description;
           
           @Enumerated(EnumType.STRING)
           @Column(nullable = false)
           private StatusType status;     //enum("pending","Completed","NotStart")
           
           @Column(nullable=false)
           private String timestamp;
           
           public Complaints(Long complaint_id, Long user_id,Long project_id,Long area_pincode,
        		   String subject,String description,StatusType StatusType,String timestamp) {
        	   
               this.complaint_id = complaint_id;
               this.user_id = user_id;
               this.project_id = project_id;
               this.area_pincode = area_pincode;
               this.subject = subject;
               this.description = description;
               this.status = StatusType; 
               this.timestamp = timestamp;
               
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

		public Long getProject_id() {
			return project_id;
		}

		public void setProject_id(Long project_id) {
			this.project_id = project_id;
		}

		public Long getArea_pincode() {
			return area_pincode;
		}

		public void setArea_pincode(Long area_pincode) {
			this.area_pincode = area_pincode;
		}

		public String getSubject() {
			return subject;
		}

		public void setSubject(String subject) {
			this.subject = subject;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public StatusType getStatus() {
			return status;
		}

		public void setStatus(StatusType status) {
			this.status = status;
		}

		public String getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		
}
