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
public class Citizen {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(cascade = CascadeType.REMOVE)
    @MapsId
    private Passport passport;
    private String name;
    private String surname;
    private int age;
    @OneToMany(mappedBy = "owner")
    private List<Car> carList;
   // @ManyToMany
   // private List<House> houseList;

}
