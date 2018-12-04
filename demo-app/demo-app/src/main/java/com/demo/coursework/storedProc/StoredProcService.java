package com.demo.coursework.storedProc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoredProcService {

    @Autowired
    MyTableRepository repository;

    public Float getSquareRoort(Integer inputNumber){
        return repository.getSquareRoort(inputNumber);
    }
}
