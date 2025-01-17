package com.almada.people.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.SimpleTimeZone;

@Entity
@Table(name = "tb_restaurant")
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    @Setter(AccessLevel.NONE)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "lastChangeDate", nullable = false)
    private String lastChangeDate;

    @Column(name = "address", nullable = false)
    private String address;

    @Builder
    public Person(String name, String email, String login, String password, String lastChangeDate, String address) {
        this.name = name;
        this.email = email;
        this.login = login;
        this.password = password;
        this.lastChangeDate = lastChangeDate;
        this.address = address;
    }

}
