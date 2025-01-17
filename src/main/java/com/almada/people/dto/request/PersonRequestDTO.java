package com.almada.people.dto.request;

import lombok.Getter;

@Getter
public class PersonRequestDTO {

    private String name;
    private String email;
    private String login;
    private String password;
    private String lastChangeDate;
    private String address;

}
