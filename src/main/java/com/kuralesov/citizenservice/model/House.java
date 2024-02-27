package com.kuralesov.citizenservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class House {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;
    @Column(name = "number")
    private Long houseNumber;

    @ManyToMany(mappedBy = "houseList")
    private List<Citizen> citizenList;
}
