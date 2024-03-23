package com.example.jwt.controller;

import com.example.jwt.entities.TechnicianAssignment;
import com.example.jwt.service.TechnicianAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/technician-assignments")
public class TechnicianAssignmentController {

    @Autowired
    private TechnicianAssignmentService technicianAssignmentService;

    @PostMapping
    public TechnicianAssignment createAssignment(@RequestBody TechnicianAssignment assignment) {
        return technicianAssignmentService.createAssignment(assignment);
    }

    @PutMapping("/{id}")
    public TechnicianAssignment updateAssignment(@PathVariable Long id, @RequestBody TechnicianAssignment assignment) {
        return technicianAssignmentService.updateAssignment(id, assignment);
    }

    @DeleteMapping("/{id}")
    public void deleteAssignment(@PathVariable Long id) {
        technicianAssignmentService.deleteAssignment(id);
    }

    @GetMapping
    public List<TechnicianAssignment> getAllAssignments() {
        return technicianAssignmentService.getAllAssignments();
    }

    @GetMapping("/{id}")
    public TechnicianAssignment getAssignmentById(@PathVariable Long id) {
        return technicianAssignmentService.getAssignmentById(id);
    }

    @GetMapping("/byTechnician/{technicianId}")
    public List<TechnicianAssignment> getAssignmentsByTechnicianId(@PathVariable Long technicianId) {
        return technicianAssignmentService.getAssignmentsByTechnicianId(technicianId);
    }

    @GetMapping("/byPeripheral/{peripheralId}")
    public List<TechnicianAssignment> getAssignmentsByPeripheralId(@PathVariable Long peripheralId) {
        return technicianAssignmentService.getAssignmentsByPeripheralId(peripheralId);
    }

}
