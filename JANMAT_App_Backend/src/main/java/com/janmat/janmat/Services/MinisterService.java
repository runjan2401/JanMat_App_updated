package com.janmat.janmat.Services;

import com.janmat.janmat.models.Ministers;
import java.util.List;

public interface MinisterService {
	Ministers saveMinister(Ministers minister);
    List<Ministers> getAllMinisters();
    Ministers getMinisterById(Long id);
    Ministers updateMinister(Long id, Ministers minister);
    void deleteMinister(Long id);
}
