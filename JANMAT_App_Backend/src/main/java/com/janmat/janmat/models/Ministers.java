package com.janmat.janmat.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

@Entity
@Table(name ="ministers")
public class Ministers {

public Ministers() {
		
		
	}
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long minister_id;
  
  @Column(unique = true, nullable = false)
  private String minister_name;
 
  @Column(nullable = false)
  private String position;
  
  @Column(nullable = false)
  private String party_name;
  
  @Column(nullable = false)
  private String start_date;
  
  @Column(nullable = false)
  private String end_date;
  
  public Ministers(Long minister_id, String minister_name,String position,String party_name,String start_date,String end_date) {
      this.minister_id = minister_id;
      this.minister_name = minister_name;
      this.position=position;
      this.party_name = party_name;
      this.start_date = start_date;
      this.end_date = end_date;
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

public String getPosition() {
	return position;
}

public void setPosition(String position) {
	this.position = position;
}

public String getParty_name() {
	return party_name;
}

public void setParty_name(String party_name) {
	this.party_name = party_name;
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
      
  }

