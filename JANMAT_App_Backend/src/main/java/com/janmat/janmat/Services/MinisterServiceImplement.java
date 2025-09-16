package com.janmat.janmat.Services;

import com.janmat.janmat.models.Ministers;
import com.janmat.janmat.Repository.MinisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MinisterServiceImplement implements MinisterService {

	@Autowired
    private MinisterRepository ministersRepository;

    @Override
    public Ministers saveMinister(Ministers minister) {
        return ministersRepository.save(minister);
    }

    @Override
    public List<Ministers> getAllMinisters() {
        return ministersRepository.findAll();
    }

    @Override
    public Ministers getMinisterById(Long id) {
        return ministersRepository.findById(id).orElse(null);
    }

    @Override
    public Ministers updateMinister(Long id, Ministers updatedMinister) {
        Ministers existing = ministersRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setMinister_name(updatedMinister.getMinister_name());
            existing.setPosition(updatedMinister.getPosition());
            existing.setParty_name(updatedMinister.getParty_name());
            existing.setStart_date(updatedMinister.getStart_date());
            existing.setEnd_date(updatedMinister.getEnd_date());
            return ministersRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteMinister(Long id) {
        ministersRepository.deleteById(id);
    }
}