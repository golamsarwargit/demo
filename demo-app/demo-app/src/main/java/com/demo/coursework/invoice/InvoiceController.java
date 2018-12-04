package com.demo.coursework.invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("Ecomm")
public class InvoiceController {
	

    @Autowired
    InvoiceService invoiceService;

    @RequestMapping(value = "invoice")//, produces = MediaType.APPLICATION_JSON_VALUE
    public List<invoice> getAllInvoice(){
        return invoiceService.getAllInvoice();	
    }

   
}
