package com.example.demo.bootstrap;


import com.example.demo.enums.Level;
import com.example.demo.model.Category;
import com.example.demo.model.Word;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.WordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private WordRepository wordRepository;

    @Override
    public void run(String... args) throws Exception {
        Category category = new Category.Builder("Animals")
                .withLevel(Level.ELEMENTARY).build();
        Category category1 = new Category.Builder("Professions")
                .withLevel(Level.PREiNTERMEDIATE).build();
        Category category2 = new Category.Builder("Math")
                .withLevel(Level.INTERMEDIATE).build();
        Category category3 = new Category.Builder("Slang")
                .withLevel(Level.UPPERiNTERMEDIATE).build();
        Category category4 = new Category.Builder("Business English")
                .withLevel(Level.ADVANCE).build();
        categoryRepository.save(category);
        categoryRepository.save(category1);
        categoryRepository.save(category2);
        categoryRepository.save(category3);
        categoryRepository.save(category4);

        Word word = new
                Word.WordBuild("Dog").withCategory(category).build();
        Word w1 = new
                Word.WordBuild("Ping").withCategory(category).build();
        Word w2 = new
                Word.WordBuild("Doctor").withCategory(category1).build();
        Word w3 = new
                Word.WordBuild("Actor").withCategory(category1).build();
        Word w4 = new
                Word.WordBuild("Square").withCategory(category2).build();
        Word w5 = new
                Word.WordBuild("Area").withCategory(category2).build();
        Word w6 = new
                Word.WordBuild("LOL").withCategory(category3).build();
        Word w7 = new
                Word.WordBuild("Unreal").withCategory(category3).build();
        Word w8 = new
                Word.WordBuild("Contract").withCategory(category4).build();
        Word w9 = new
                Word.WordBuild("Avengers").withCategory(category4).build();
        wordRepository.save(word);
        wordRepository.save(w1);
        wordRepository.save(w2);
        wordRepository.save(w3);
        wordRepository.save(w4);
        wordRepository.save(w5);
        wordRepository.save(w6);
        wordRepository.save(w7);
        wordRepository.save(w8);
        wordRepository.save(w9);
    }
}
