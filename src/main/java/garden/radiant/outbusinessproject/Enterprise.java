package garden.radiant.outbusinessproject;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotEmpty;

public class Enterprise {
    @NotEmpty()
    private String name;
    @Size(min = 10)
    private String description;
    @NotEmpty()
    private String contactName;
    @NotEmpty()
    @Email()
    private String contactEmail;

    Enterprise() {}

    void setName(String name) {
        this.name = name;
    }

    void setDescription(String description) {
        this.description = description;
    }

    void setContactName(String contactName) {
        this.contactName = contactName;
    }

    void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
