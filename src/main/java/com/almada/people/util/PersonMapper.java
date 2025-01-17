package com.almada.people.util;

import com.almada.people.dto.request.PersonRequestDTO;
import com.almada.people.dto.response.PersonResponseDTO;
import com.almada.people.entity.Person;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public Person toPerson(PersonRequestDTO personDTO) {

        return Person.builder()
                .name(personDTO.getName())
                .email(personDTO.getEmail())
                .login(personDTO.getLogin())
                .password(personDTO.getPassword())
               .lastChangeDate(personDTO.getLastChangeDate())
                .address(personDTO.getAddress())
                .build();

    }

    public PersonResponseDTO toPersonDTO(Person person) {
        return new PersonResponseDTO(person);
    }

    public List<PersonResponseDTO> toPeopleDTO(List<Person> peopleList) {
        return peopleList.stream().map(PersonResponseDTO::new).collect(Collectors.toList());
    }

    public void updatePersonData(Person person, PersonRequestDTO personDTO) {

        person.setName(personDTO.getName());
        person.setEmail(personDTO.getEmail());
        person.setLogin(personDTO.getLogin());
        person.setPassword(personDTO.getPassword());
        person.setLastChangeDate(personDTO.getLastChangeDate());
        person.setAddress(personDTO.getAddress());

    }

}
