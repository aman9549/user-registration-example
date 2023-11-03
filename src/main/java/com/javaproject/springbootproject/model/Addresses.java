package com.javaproject.springbootproject.model;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Transactional
@Data
@Entity
@Table(name = "UserAddress")
public class Addresses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long addressId;
    @Column(name = "full_add")
    private String fullAddress;


}
