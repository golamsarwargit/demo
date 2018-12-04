package com.demo.coursework.storedProc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("storedProc")
public class SpController {

    @Autowired
    StoredProcService service;

    @RequestMapping(value = "squareRoot", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ResponseEntity<Float> getSquareRoot(@RequestBody Order order){
        System.out.println(order);

        return new ResponseEntity<>(service.getSquareRoort(12), HttpStatus.OK);
    }
}
