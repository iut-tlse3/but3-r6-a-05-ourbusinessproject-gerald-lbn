package garden.radiant.outbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;

import java.util.Collection;

@Entity()
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String title;
    private String description;

    Project() {}

    public Long getId() {
        return this.id;
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setDescription(String description) {
        this.description = description;
    }
}
