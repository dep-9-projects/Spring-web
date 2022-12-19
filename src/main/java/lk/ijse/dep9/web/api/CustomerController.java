package lk.ijse.dep9.web.api;

import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
    @PostMapping
    public String saveCustomer(@PathVariable("customerId") String customerId){
        System.out.println("save Customer()"+customerId);
        return "C001";
    }
    @PutMapping
    public void updateCustomer(){
        System.out.println("update Customer()");
    }
    @DeleteMapping
    public void deleteCustomer(){
        System.out.println("delete Customer()");
    }
    @GetMapping
    public String getAllCustomer(){
        return "Get All Customer()";
    }
    @GetMapping("/{id}")
    public String getCustomer(@PathVariable String id){
        return  "Get Customer()"+id;
    }
    @GetMapping(params = "q")
    public String findCustomers(String q){
        return "Find Customer(): "+q;
    }
    @GetMapping(params = {"page","size"})
    public String getAllPaginatedCustomers(int page,int size){
        return "Get All Paginated Customers() , page: "+page+",size: "+size;
    }
    @GetMapping(params = {"page","size","q"})
    public String findPaginatedCustomers(@RequestParam("q") String query,int page,int size){
        return "find Paginated Customers() ,"+" query: "+query+" page: "+page+" size: "+size;
    }
}
