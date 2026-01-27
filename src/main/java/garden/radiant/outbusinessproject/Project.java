package garden.radiant.outbusinessproject;

import jakarta.validation.constraints.NotEmpty;

public class Project {
    @NotEmpty
    private String title;
    private String description;

    Project() {}

    void setTitle(String title) {
        this.title = title;
    }

    void setDescription(String description) {
        this.description = description;
    }
}
