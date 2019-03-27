package com.springboot.vendor.api.v1.mapper;

import com.springboot.vendor.api.v1.model.CategoryDTO;
import com.springboot.vendor.domain.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);
    CategoryDTO categoryToCategoryDTO(Category category);
}
