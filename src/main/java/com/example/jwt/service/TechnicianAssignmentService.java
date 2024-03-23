package com.example.jwt.service;

import com.example.jwt.repos.TechnicianAssignmentRepository;
import com.example.jwt.entities.TechnicianAssignment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TechnicianAssignmentService {

    @Autowired
    private TechnicianAssignmentRepository technicianAssignmentRepository;

    public TechnicianAssignment createAssignment(TechnicianAssignment assignment) {
        assignment.setAssignedAt(LocalDateTime.now());
        return technicianAssignmentRepository.save(assignment);
    }

    public TechnicianAssignment updateAssignment(Long id, TechnicianAssignment assignment) {
        assignment.setId(id);
        return technicianAssignmentRepository.save(assignment);
    }

    public void deleteAssignment(Long id) {
        technicianAssignmentRepository.deleteById(id);
    }

    public List<TechnicianAssignment> getAllAssignments() {
        return technicianAssignmentRepository.findAll();
    }

    public TechnicianAssignment getAssignmentById(Long id) {
        return technicianAssignmentRepository.findById(id).orElse(null);
    }

    public List<TechnicianAssignment> getAssignmentsByTechnicianId(Long technicianId) {
        return technicianAssignmentRepository.findAllByTechnician_Id(technicianId);
    }

    public List<TechnicianAssignment> getAssignmentsByPeripheralId(Long peripheralId) {
        return technicianAssignmentRepository.findAllByPeripheral_Id(peripheralId);
    }

}
