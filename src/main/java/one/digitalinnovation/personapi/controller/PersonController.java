package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fellipe Toledo
 * @created 03/01/2022
 */

@RestController
@RequestMapping("api/v1/person")
public class PersonController {

    @GetMapping
    public String getPerson(){
        return "API Test!!";
    }
}
