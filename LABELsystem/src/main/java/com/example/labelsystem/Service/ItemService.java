package com.example.labelsystem.Service;

import com.example.labelsystem.Dao.ItemDao;
import com.example.labelsystem.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ItemService")
public class ItemService {
    @Autowired
    private ItemDao itemDao;

    public List<Item> queryLimit(Integer currentPage, Integer pageSzie) {
        return itemDao.queryLimit(currentPage, pageSzie);
    }

    public Integer addItem(Item item) {
        return itemDao.addItem(item);
    }

    public Integer updateItem(Item item) {
        return itemDao.updateItem(item);
    }

    public Integer deleteItem(Item item) {
        return itemDao.deleteItem(item);
    }


}
