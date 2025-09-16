package com.janmat.janmat.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Project_Fund")
public class ProjectFund {
     public ProjectFund() {
    	 
     }
     
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
      
     private Long project_id;
     
     @Column(unique = true, nullable = false)
     private Long minister_id;
     
     @Column(unique = true, nullable = false)
     private String minister_name;
    
     @Column(nullable = false)
     private String description;
     
     @Column(nullable = false)
     private String start_date;
     
     @Column(nullable = false)
     private String end_date;
     
     @Column(nullable = false)
     private String allocated_fund;
     
     @Column(nullable =false)
     private String ammount_spent;
     
     @Column(nullable=false)
     private String status;
     
     public ProjectFund(Long minister_id, String minister_name,String description,String start_date,
          String end_date,String allocated_fund,String ammount_spent,String status) {
    	 
         this.minister_id = minister_id;
         this.minister_name = minister_name;
         this.description=description;
         this.start_date = start_date;
         this.end_date = end_date;
         this.allocated_fund = allocated_fund;
         this.ammount_spent = ammount_spent;
         this.status = status;
         }

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
		this.project_id = project_id;
	}

	public Long getMinister_id() {
		return minister_id;
	}

	public void setMinister_id(Long minister_id) {
		this.minister_id = minister_id;
	}

	public String getMinister_name() {
		return minister_name;
	}

	public void setMinister_name(String minister_name) {
		this.minister_name = minister_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getAllocated_fund() {
		return allocated_fund;
	}

	public void setAllocated_fund(String allocated_fund) {
		this.allocated_fund = allocated_fund;
	}

	public String getAmmount_spent() {
		return ammount_spent;
	}

	public void setAmmount_spent(String ammount_spent) {
		this.ammount_spent = ammount_spent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
