package com.springboot.vendor.api.v1.mapper;

import org.junit.Before;

import static org.junit.Assert.*;

public class CategoryMapperTest {

    public static final String NAME = "Joe";
    public static final long ID = 1L;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    @Before
    public void setUp() throws Exception {
    }
}