package Assignment.API.service;



import Assignment.API.entity.ManufacturingProcess;
import Assignment.API.entity.NatureOfBusiness;
import Assignment.API.entity.Supplier;
import Assignment.API.repo.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> searchSuppliers(
            String location,
            String natureOfBusiness,
            Set<String> manufacturingProcesses,
            int page,
            int size) {

          Pageable pageable = PageRequest.of(page, size);
          List<Supplier> supp= supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
                location, natureOfBusiness, manufacturingProcesses, pageable);
          return supp;
    }
}

