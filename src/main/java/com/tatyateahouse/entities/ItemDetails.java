package com.tatyateahouse.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Menu")
@NoArgsConstructor
@Getter
@Setter
public class ItemDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    private  String itemName;

    private BigDecimal itemPrice;
}
