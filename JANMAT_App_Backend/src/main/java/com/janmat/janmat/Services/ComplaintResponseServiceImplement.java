package com.janmat.janmat.Services;

import com.janmat.janmat.models.ComplaintsResponse;
import com.janmat.janmat.Repository.ComplaintsResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintResponseServiceImplement implements ComplaintResponseService {

	 @Autowired
	    private ComplaintsResponseRepository complaintsResponseRepository;

	    @Override
	    public ComplaintsResponse saveResponse(ComplaintsResponse response) {
	        return complaintsResponseRepository.save(response);
	    }

	    @Override
	    public List<ComplaintsResponse> getAllResponses() {
	        return complaintsResponseRepository.findAll();
	    }

	    @Override
	    public ComplaintsResponse getResponseById(Long id) {
	        return complaintsResponseRepository.findById(id).orElse(null);
	    }

	    @Override
	    public ComplaintsResponse updateResponse(Long id, ComplaintsResponse updatedResponse) {
	        ComplaintsResponse existing = complaintsResponseRepository.findById(id).orElse(null);
	        if (existing != null) {
	            existing.setUser_id(updatedResponse.getUser_id());
	            existing.setMinister_id(updatedResponse.getMinister_id());
	            existing.setResponse(updatedResponse.getResponse());
	            return complaintsResponseRepository.save(existing);
	        }
	        return null;
	    }

	    @Override
	    public void deleteResponse(Long id) {
	        complaintsResponseRepository.deleteById(id);
	    }
	}