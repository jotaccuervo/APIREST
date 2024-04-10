package com.sena.proyectoSena.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_local")

public class Local {

    @Id
    @Column(name = "id_Local")

    private Long id;
    private String name;
    private String floor;
    
}
