package com.example.airbnb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
}
