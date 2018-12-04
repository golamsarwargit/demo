package com.demo.coursework.storedProc;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MyTableRepository extends CrudRepository<MyTable, Long> {
    @Procedure(name = "my_sqrt")
    public Float getSquareRoort(@Param("input_number") Integer inputNumber);

}
