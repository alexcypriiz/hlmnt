package ru.podlubnyy.hlmnt.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

/**
 * Created by Alexey Podlubnyy on 20.08.2021
 */

@Data
@Entity
@Table(name = "client")
public class Client {

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Id
    @Column(name = "password")
    private long password;
}