package com.demo.coursework.storedProc;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sptest")
@NamedStoredProcedureQueries({

        @NamedStoredProcedureQuery(name = "my_sqrt", procedureName = "my_sqrt",
                parameters = {
                        @StoredProcedureParameter(mode = ParameterMode.IN, name = "input_number", type = Integer.class),
                        @StoredProcedureParameter(mode = ParameterMode.OUT, name = "out_number", type = Float.class)
                }
        )
})

public class MyTable implements Serializable {

    @Id
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
