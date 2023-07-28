package com.example.newsletter.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="lead")
public class Lead {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

}
