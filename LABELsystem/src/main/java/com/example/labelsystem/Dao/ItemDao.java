package com.example.labelsystem.Dao;

import com.example.labelsystem.Entity.Item;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemDao {
    List<Item> queryLimit(Integer currentPage, Integer pageSize);

    Integer addItem(Item item);

    Integer updateItem(Item item);

    Integer deleteItem(Item item);
}
