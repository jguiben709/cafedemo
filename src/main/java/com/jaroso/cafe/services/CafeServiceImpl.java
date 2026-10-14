package com.jaroso.cafe.services;

import com.jaroso.cafe.entities.Cafe;
import com.jaroso.cafe.repositories.CafeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CafeServiceImpl implements CafeService {

    private final CafeRepository cafeRepository;

    public CafeServiceImpl(CafeRepository cafeRepository) {
        this.cafeRepository = cafeRepository;
    }

    @Override
    public List<Cafe> findAll() {
        return cafeRepository.findAll();
    }

    @Override
    public Optional<Cafe> findById(Long id) {
        return cafeRepository.findById(id);
    }
}
