package com.example.labelsystem.Controller;


import com.example.labelsystem.Service.ItemService;
import com.example.labelsystem.Entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("Item")
public class ItemController {
    @Autowired
    public ItemService itemService;

    String message = "";

    @RequestMapping("/queryLimit")
    public List<Item> queryLimit(@RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize) {
        return itemService.queryLimit(currentPage, pageSize);
    }

    @PostMapping("/addItem")
    public String addItem(@RequestBody Item item) {
        try {
            itemService.addItem(item);
            message = "add new item";

        } catch (Exception exception) {
            message = "add item exception";
        }
        return message;
    }

    @PutMapping("/updateItem")
    public String updateItem(@RequestBody Item item) {
        try {
            message = itemService.updateItem(item) == 1 ? "update" + item.getItemId() + "sucess" : "update" + item.getItemId() + " failuer";
        } catch (Exception exception) {
            message = "update" + item.getItemId() + " exception";
        }
        return message;
    }

    @DeleteMapping("deleteItem")
    public String deleteItem(@RequestBody Item item) {
        try {
            message = itemService.deleteItem(item) == 1 ? "delete" + item.getItemId() + "sucess" : "delete" + item.getItemId() + " failuer";
        } catch (Exception exception) {
            message = "delerte exception";
        }
        return message;
    }


}
