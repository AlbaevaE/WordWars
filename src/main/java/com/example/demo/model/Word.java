package com.example.demo.model;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//@ManyToMany(
//join Tables Answers and User
@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "word")
public class Word {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    @OneToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public static class WordBuild {
        private Long id;
        private String word;
        private Category category;

        public WordBuild(String word) {
            this.word = word;
        }

        public WordBuild withCategory(Category category){
            this.category = category;
            return this;
        }

        public Word build() {
            Word word = new Word();
            word.word = this.word;
            word.category = category;
            return word;
        }
    }
}
