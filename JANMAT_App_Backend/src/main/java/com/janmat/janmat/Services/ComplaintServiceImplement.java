package com.janmat.janmat.Services;

import com.janmat.janmat.models.Complaints;
import com.janmat.janmat.Repository.ComplaintsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintServiceImplement implements ComplaintService {

	 @Autowired
	    private ComplaintsRepository complaintsRepository;

	    @Override
	    public Complaints saveComplaint(Complaints complaint) {
	        return complaintsRepository.save(complaint);
	    }

	    @Override
	    public List<Complaints> getAllComplaints() {
	        return complaintsRepository.findAll();
	    }

	    @Override
	    public Complaints getComplaintById(Long id) {
	        return complaintsRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Complaints updateComplaint(Long id, Complaints updatedComplaint) {
	        Complaints existing = complaintsRepository.findById(id).orElse(null);
	        if (existing != null) {
	            existing.setUser_id(updatedComplaint.getUser_id());
	            existing.setProject_id(updatedComplaint.getProject_id());
	            existing.setArea_pincode(updatedComplaint.getArea_pincode());
	            existing.setSubject(updatedComplaint.getSubject());
	            existing.setDescription(updatedComplaint.getDescription());
	            existing.setStatus(updatedComplaint.getStatus());
	            existing.setTimestamp(updatedComplaint.getTimestamp());
	            return complaintsRepository.save(existing);
	        }
	        return null;
	    }

	    @Override
	    public void deleteComplaint(Long id) {
	        complaintsRepository.deleteById(id);
	    }
	}