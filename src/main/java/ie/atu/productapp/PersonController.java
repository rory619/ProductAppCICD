/*package ie.atu.productapp;


import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping

public class PersonController {


    List<Person> personList = new ArrayList<>();

    @GetMapping

    public List<Person> getPersonList() {
        return personList;
    }

    public void setProductList(List<Product> productList) {
        this.personList = personList;
    }
    @PostMapping
    public List<Product> addProduct(@Valid Product product)
    {
        personList.add(Person);
        return personList;
    }

}
*/