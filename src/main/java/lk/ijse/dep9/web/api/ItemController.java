package lk.ijse.dep9.web.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/items")
public class ItemController {
    @PostMapping
    public String saveItem(){
        return  "save Item() as query string";
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String saveItemJSON(){
        return  "save Item() as JSON";
    }

    @PutMapping
    public void updateItem(){
        System.out.println("update Item()");
    }
    @DeleteMapping
    public String deleteAll(){
        return "delete All Items";
    }
    @DeleteMapping(headers = "Authorization")
    public String deleteAllItems(@PathVariable("Authorization") String authorization){
        return "delete All Items() : authorization:"+authorization;
    }

    @DeleteMapping("/{code:I\\d{3}}")
    public String deleteItem(@PathVariable String code){
        return "delete Item(): code:"+code;
    }
    @GetMapping
    public void getItem(){
        System.out.println("Get Item()");
    }
}
