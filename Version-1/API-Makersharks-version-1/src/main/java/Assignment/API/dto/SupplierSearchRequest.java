package Assignment.API.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Set;
// we can use @Getter @Setter also
public class SupplierSearchRequest {

    @NotBlank(message = "location must not be blank")
    @Size(min = 3,message = "minimum size of the location should be 3 ")
    private String location;

    @NotNull
    private String natureOfBusiness;

    @NotEmpty
    private Set<String> manufacturingProcesses;

    public String getLocation() {
        return location;
    }

    public SupplierSearchRequest(String location, Set<String> manufacturingProcesses, String natureOfBusiness) {
        this.location = location;
        this.manufacturingProcesses = manufacturingProcesses;
        this.natureOfBusiness = natureOfBusiness;
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

