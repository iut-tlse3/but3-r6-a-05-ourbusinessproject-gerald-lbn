package garden.radiant.outbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.util.Collection;

@Entity()
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty
    private String title;
    private String description;

    @NotNull()
    @ManyToOne()
    private Enterprise enterprise;

    public Enterprise getEnterprise() {
        return this.enterprise;
    }

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

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
}
