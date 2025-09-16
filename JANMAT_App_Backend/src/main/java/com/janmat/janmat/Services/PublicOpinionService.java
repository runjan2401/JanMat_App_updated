package com.janmat.janmat.Services;

import com.janmat.janmat.models.PublicOpinion;
import java.util.List;

public interface PublicOpinionService {
	 PublicOpinion createOpinion(PublicOpinion opinion);
	    List<PublicOpinion> getAllOpinions();
	    PublicOpinion getOpinionById(Long id);
	    PublicOpinion updateOpinion(Long id, PublicOpinion updatedOpinion);
	    void deleteOpinion(Long id);
}
