package com.almada.people.dto.response;


import com.almada.people.entity.Person;
import lombok.Getter;

@Getter
public class PersonResponseDTO {

    private Long id;
    private String name;
    private String email;
    private String login;
    private String password;
    private String lastChangeDate;
    private String address;

    public PersonResponseDTO(Person person) {
        this.id = person.getId();
        this.name = person.getName();
        this.email = person.getEmail();
        this.login = person.getLogin();
        this.password = person.getPassword();
        this.lastChangeDate = person.getLastChangeDate();
        this.address = person.getAddress();
    }
}
