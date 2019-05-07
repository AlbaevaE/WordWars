package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CategoryController.URL_CATEGORY)

public class CategoryController {
    public static final String URL_CATEGORY = "/spring/category";

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/getCategoryById/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return this.categoryService.getCategoryById(id);
    }

    @PostMapping("/postCategory")
    public Category postCategory(@RequestBody Category category) {
        return this.categoryService.saveCategory(category);
    }

    @GetMapping("/getAllCategories")
    public List<Category> getAllCategories() {
        return this.categoryService.getAllCategory();
    }

    @DeleteMapping("/deleteCategoryById/{id}")
    public void deleteCategoryById(@PathVariable Long id) {
        this.categoryService.deleteCategoryById(id);
    }

    @DeleteMapping("/deleteAllCategories")
    public void deleteAllCategories() {
        this.categoryService.deleteAllCategories();
    }


}
