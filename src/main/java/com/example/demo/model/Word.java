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


    private Word() {

    }

    public static class WordBuild {
        private Long id;
        private String word;

        public WordBuild(String word) {
            this.word = word;
        }

        public Word build(){
            Word word = new Word();
            word.word = this.word;
            return word;
        }
    }
}
