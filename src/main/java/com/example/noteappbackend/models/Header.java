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
@Entity @Table(name = "HEADERS")
public class Header {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TEXT")
    private String text;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="title_id")
    @JsonIgnoreProperties("headers")
    public Title title;

    @OneToMany(mappedBy="header", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("header")
    public List<Para> paras = new ArrayList<>();

    @OneToMany(mappedBy="header", cascade = CascadeType.ALL)
    @JsonIgnoreProperties("header")
    public List<Codeblock> codeblocks = new ArrayList<>();
}
