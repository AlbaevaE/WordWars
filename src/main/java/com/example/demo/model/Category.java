package com.example.demo.model;

import com.example.demo.enums.Level;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "category")
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    @Enumerated(EnumType.STRING)
    Level level;

    private Category(){}

    public static class Builder {
        private Long id;
        String name;
        Level level;

        public Builder(String name) {
            this.name = name;
        }

        public Builder withLevel(Level level) {
            this.level = level;
            return this;
        }

        public Category build() {
            Category category = new Category();
            category.name = name;
            category.level = level;
            return category;
        }
    }
}
