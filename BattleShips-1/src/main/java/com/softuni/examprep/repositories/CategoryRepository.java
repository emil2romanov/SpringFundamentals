package com.softuni.examprep.repositories;

import com.softuni.examprep.domain.entities.Category;
import com.softuni.examprep.domain.enums.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Optional<Category> findByName(CategoryType name);
}
