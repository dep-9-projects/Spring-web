package lk.ijse.dep9.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemController {

    @GetMapping
    public ModelAndView getItemPage(ModelMap model){
        System.out.println("Came to the getItemPage()");
        List<Item> itemList = new ArrayList<>();

        itemList.add(new Item("I001","keyboard",1,new BigDecimal("500")));
        itemList.add(new Item("I002","mouse",1,new BigDecimal("2777")));
        itemList.add(new Item("I003","bottle",1,new BigDecimal("6435")));
        itemList.add(new Item("I004","flashDrive",1,new BigDecimal("6477")));
        itemList.add(new Item("I005","WebCamera",1,new BigDecimal("3563")));
        model.addAttribute("itemList",itemList);
        return new ModelAndView("items",model);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Item implements Serializable{
        private String code;
        private String description;
        private int qty;
        private BigDecimal unitPrice;
    }
}
