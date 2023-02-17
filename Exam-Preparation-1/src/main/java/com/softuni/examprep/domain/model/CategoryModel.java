package com.softuni.examprep.domain.model;

import com.softuni.examprep.domain.enums.CategoryType;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CategoryModel {

    private Long id;
    private CategoryType name;
    private String description;
}
