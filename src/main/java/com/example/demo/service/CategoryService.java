package com.example.demo.service;

import com.example.demo.model.Category;

import java.util.List;

public interface CategoryService {
    Category getCategoryById(Long id);
    List<Category> getAllCategory();
    Category saveCategory(Category category);
    void deleteCategoryById(Long id);
    void deleteAllCategories();
}
