package com.example.jwt.repos;

import com.example.jwt.entities.TechnicianAssignment;
import com.example.jwt.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnicianAssignmentRepository extends JpaRepository<TechnicianAssignment, Long> {
    List<TechnicianAssignment> findAllByTechnician_Id(Long id);
    List<TechnicianAssignment> findAllByPeripheral_Id(Long id);
}
