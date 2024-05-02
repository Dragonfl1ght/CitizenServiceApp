package com.kuralesov .citizenservice.model;

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
    @Column(name = "name")
    private String name;
    private String surname;
    private int age;
    @OneToMany(mappedBy = "owner")
    private List<Car> carList;
    @ManyToMany
    @JoinTable(name = "citizen_house_relationship",
            joinColumns = @JoinColumn(name = "citizen_id"),
            inverseJoinColumns = @JoinColumn(name = "house_id")
    )
    private List<House> houseList;

}
