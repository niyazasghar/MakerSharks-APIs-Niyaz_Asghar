package Assignment.API.entity;

import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;

    private String website;

    private String location;


    private String natureOfBusiness;

      @ElementCollection
    private Set<String> manufacturingProcesses;

    // Getters and Setters
    public Long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Long supplierId) {
        this.supplierId = supplierId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNatureOfBusiness() {
        return natureOfBusiness;
    }

    public void setNatureOfBusiness(String natureOfBusiness) {
        this.natureOfBusiness = natureOfBusiness;
    }

    public Set<String> getManufacturingProcesses() {
        return manufacturingProcesses;
    }

    public void setManufacturingProcesses(Set<String> manufacturingProcesses) {
        this.manufacturingProcesses = manufacturingProcesses;
    }
}
