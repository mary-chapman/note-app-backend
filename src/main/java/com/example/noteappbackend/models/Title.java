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
@Entity @Table(name = "TITLES")
public class Title {
    @Id
    private String id;

    @Column(name = "TEXT")
    private String text;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="USER_ID")
    @JsonIgnoreProperties("titles")
    public User user;

    @OneToMany(mappedBy="title", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("title")
    public List<Header> headers = new ArrayList<>();
}
