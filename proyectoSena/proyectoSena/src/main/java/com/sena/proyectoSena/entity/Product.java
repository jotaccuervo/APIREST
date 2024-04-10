package com.sena.proyectoSena.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_products")
@Data

public class Product {

    @Id
    private Long IdProduct;
    private String name;
    private String brand;
    private boolean expired;
    private float price;

    @ManyToOne
    @JoinColumn(
            name = "id",
            referencedColumnName = "id_Local"
    )
    private Local Local;
}
