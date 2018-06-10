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
@Entity @Table(name = "NOTES")
public class Note {
    @Id
    @Column(name = "ID")
    private String id;

    @Column(name = "TEXT")
    private String text;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="USER_ID")
    @JsonIgnoreProperties("notes")
    public User user;

}
