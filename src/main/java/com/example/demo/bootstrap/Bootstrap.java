package com.example.demo.bootstrap;


import com.example.demo.enums.Level;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {

    @Autowired
    private CategoryRepository categoryRepository;

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
    }
}
