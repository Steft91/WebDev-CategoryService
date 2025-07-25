package com.example.categoria.services;
import com.example.categoria.models.entities.Category;
import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Category createCategory(Category category);

    List<Category> getAllCategories();

    Optional<Category> getCategoryById(Long id);

    Optional<Category> updateCategory(Long id, Category categoryDetails);

    boolean deleteCategory(Long id);

}