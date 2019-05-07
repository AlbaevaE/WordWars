package com.example.demo.model;


import javax.persistence.*;

//@ManyToMany(
//join Tables Answers and User

@Entity
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
}
