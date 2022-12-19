package lk.ijse.dep9.web.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    @PostMapping
    public void saveOrder(){
        System.out.println("save Order()");
    }
    @PutMapping
    public void updateOrder(){
        System.out.println("update Order()");
    }
    @DeleteMapping
    public void deleteOrder(){
        System.out.println("delete Order()");
    }
    @GetMapping
    public void getOrder(){
        System.out.println("Get Order()");
    }
}
