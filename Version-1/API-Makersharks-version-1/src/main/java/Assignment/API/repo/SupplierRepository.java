package Assignment.API.repo;


import Assignment.API.entity.Supplier;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
    List<Supplier> findByLocationAndNatureOfBusinessAndManufacturingProcessesIn(
            String location,
            String natureOfBusiness,
            Set<String> manufacturingProcesses,
            Pageable pageable
    );
}
