package com.example.noteappbackend.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity @Table(name = "USERS")
public class User {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PASSWORD")
    private String password;

    @OneToMany(mappedBy="user", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("user")
    public List<Note> notes = new ArrayList<>();


}
