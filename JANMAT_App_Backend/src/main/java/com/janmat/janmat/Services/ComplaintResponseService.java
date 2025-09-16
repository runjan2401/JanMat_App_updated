package com.janmat.janmat.Services;


import com.janmat.janmat.models.ComplaintsResponse;
import java.util.List;

public interface ComplaintResponseService {
	 ComplaintsResponse saveResponse(ComplaintsResponse response);
	    List<ComplaintsResponse> getAllResponses();
	    ComplaintsResponse getResponseById(Long id);
	    ComplaintsResponse updateResponse(Long id, ComplaintsResponse updatedResponse);
	    void deleteResponse(Long id);
}

