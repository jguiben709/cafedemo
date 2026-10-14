package com.jaroso.cafe.repositories;

import com.jaroso.cafe.entities.Cafe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CafeRepository extends JpaRepository<Cafe, Long> {
}
