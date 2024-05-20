package com.lucas.workshopcursejava.repositories;

import com.lucas.workshopcursejava.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
