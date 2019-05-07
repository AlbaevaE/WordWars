package com.example.demo.service;

import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category getCategoryById(Long id) {
        return this.categoryRepository.findById(id).get();
    }

    @Override
    public List<Category> getAllCategory() {
        return this.categoryRepository.findAll();
    }

    @Override
    public Category saveCategory(Category category) {
        return this.categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryById(Long id) {
        this.categoryRepository.deleteById(id);
    }

    @Override
    public void deleteAllCategories() {
        this.categoryRepository.deleteAll();
    }
}
