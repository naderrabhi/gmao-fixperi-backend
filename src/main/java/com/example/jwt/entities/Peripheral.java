package com.example.jwt.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_peripheral")
public class Peripheral {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String type;
    private String description;
    private String status; // "BROKEN" or "FIXED"

    @ManyToOne(fetch = FetchType.EAGER) // Optional for user who reported
    @JoinColumn(name = "id_reporteduser")
    private UserEntity users;

    @Column(insertable=false, updatable=false)
    private Integer id_reporteduser;


}
