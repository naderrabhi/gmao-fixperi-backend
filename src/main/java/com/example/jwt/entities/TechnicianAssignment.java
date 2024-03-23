package com.example.jwt.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_technician-assignment")
public class TechnicianAssignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_technician")
    private UserEntity technician;

    @Column(insertable=false, updatable=false)
    private Integer id_technician;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_peripheral")
    private Peripheral peripheral;

    @Column(insertable=false, updatable=false)
    private Long id_peripheral;

    private LocalDateTime assignedAt;
    private LocalDateTime completedAt; // Nullable

}
