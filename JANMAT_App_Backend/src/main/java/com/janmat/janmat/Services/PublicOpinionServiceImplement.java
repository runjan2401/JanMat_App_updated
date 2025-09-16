package com.janmat.janmat.Services;


import com.janmat.janmat.models.PublicOpinion;
import com.janmat.janmat.Repository.PublicOpinionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicOpinionServiceImplement implements PublicOpinionService {

	 @Autowired
	    private PublicOpinionRepository publicOpinionRepository;

	    @Override
	    public PublicOpinion createOpinion(PublicOpinion opinion) {
	        return publicOpinionRepository.save(opinion);
	    }

	    @Override
	    public List<PublicOpinion> getAllOpinions() {
	        return publicOpinionRepository.findAll();
	    }

	    @Override
	    public PublicOpinion getOpinionById(Long id) {
	        return publicOpinionRepository.findById(id).orElse(null);
	    }

	    @Override
	    public PublicOpinion updateOpinion(Long id, PublicOpinion updatedOpinion) {
	        PublicOpinion existingOpinion = publicOpinionRepository.findById(id).orElse(null);
	        if (existingOpinion != null) {
	            existingOpinion.setUser_id(updatedOpinion.getUser_id());
	            existingOpinion.setMinister_id(updatedOpinion.getMinister_id());
	            existingOpinion.setRating(updatedOpinion.getRating());
	            existingOpinion.setComment(updatedOpinion.getComment());
	            return publicOpinionRepository.save(existingOpinion);
	        }
	        return null;
	    }

	    @Override
	    public void deleteOpinion(Long id) {
	        publicOpinionRepository.deleteById(id);
	    }
	}
