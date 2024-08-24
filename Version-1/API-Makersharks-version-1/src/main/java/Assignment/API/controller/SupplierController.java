package Assignment.API.controller;

import Assignment.API.dto.SupplierSearchRequest;
import Assignment.API.entity.Supplier;
import Assignment.API.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    @PostMapping("/query")
    public ResponseEntity<List<Supplier>> searchSuppliers(
             @RequestBody SupplierSearchRequest searchRequest
            ) {
        List<Supplier> suppliers = supplierService.searchSuppliers(
                searchRequest.getLocation(),
                searchRequest.getNatureOfBusiness(),
                searchRequest.getManufacturingProcesses(),
                0,
                5
        );
        return new ResponseEntity<>(suppliers, HttpStatus.OK);
    }
}


