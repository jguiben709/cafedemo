package com.jaroso.cafe.services;

import com.jaroso.cafe.entities.Cafe;

import java.util.List;
import java.util.Optional;

public interface CafeService {

    List<Cafe> findAll();

    Optional<Cafe> findById(Long id);
}
