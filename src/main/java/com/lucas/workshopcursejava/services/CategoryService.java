package com.lucas.workshopcursejava.services;

import com.lucas.workshopcursejava.entities.Category;
import com.lucas.workshopcursejava.entities.User;
import com.lucas.workshopcursejava.repositories.CategoryRepository;
import com.lucas.workshopcursejava.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll(){
        return repository.findAll();

    }
    public  Category findById(Long id){
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}
