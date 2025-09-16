package com.janmat.janmat.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name ="users")
public class Users {
	public Users() {
			
	}
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long user_id;

	    @Column(unique = true, nullable = false)
	    private String username;

	    @Column(nullable = false)
	    private String email; 
	    
	    @Column(nullable=false,unique=true)
	    private String password;

	    @Column(nullable=false)
	    private String role;
	    
	    @Column(nullable=false,unique=true)
	    private Date created_at = new Date();
	    
	    
	    

	    public Users(Long user_id, String username,String email,String password,String role,Date created_at) {
	        this.user_id = user_id;
	        this.username = username;
	        this.email=email;
	        this.password = password;
	        this.role = role;
	        
	    }

		public Long getUser_id() {
			return user_id;
		}

		public void setUser_id(Long user_id){
			this.user_id = user_id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public Date getCreated_at() {
			return created_at;
		}

		public void setCreated_at(Date created_at) {
			this.created_at = created_at;
		}

		
	
}

