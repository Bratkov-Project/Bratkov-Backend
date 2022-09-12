package com.bratkov.project.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table (name = "customers")
public class Customers {

    @Id
    @GeneratedValue
    private Integer id;

    @Column (nullable = false)
    private String firstname;

    @Column (nullable = false)
    private String lastname;

    @Column (nullable = false, unique = true)
    private String username;

    @Column (nullable = false)
    @JsonProperty (access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @Column (nullable = false, unique = true)
    private String email;



}
