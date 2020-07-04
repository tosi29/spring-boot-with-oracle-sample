package com.example.demo;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class SampleService {
    private final SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }

    public SampleEntity generate() {
        SampleEntity sampleEntity = new SampleEntity(UUID.randomUUID().toString(), LocalDateTime.now());
        sampleRepository.save(sampleEntity);
        return sampleEntity;
    }

    public Optional<SampleEntity> read(String id) {
        return sampleRepository.findById(id);
    }

    public List<SampleEntity> all() {
        return sampleRepository.findAll();
    }
}
