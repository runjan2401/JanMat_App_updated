package com.janmat.janmat.Services;

import com.janmat.janmat.models.Complaints;
import java.util.List;

public interface ComplaintService {
	 Complaints saveComplaint(Complaints complaint);
	    List<Complaints> getAllComplaints();
	    Complaints getComplaintById(Long id);
	    Complaints updateComplaint(Long id, Complaints updatedComplaint);
	    void deleteComplaint(Long id);
}

