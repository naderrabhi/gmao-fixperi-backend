package com.example.jwt.repos;

import com.example.jwt.entities.Peripheral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PeripheralRepository extends JpaRepository<Peripheral, Long> {
    List<Peripheral> findAllByUsers_Id(Long id);
}
