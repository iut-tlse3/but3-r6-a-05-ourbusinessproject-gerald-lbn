package garden.radiant.outbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotEmpty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

@Entity()
public class Enterprise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotEmpty()
    private String name;
    @Size(min = 10)
    private String description;
    @NotEmpty()
    private String contactName;
    @NotEmpty()
    @Email()
    private String contactEmail;
    @OneToMany(mappedBy = "enterprise")
    private Collection<Project> projects;

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

    public Long getId() {
        return this.id;
    }

    public Collection<Project> getProjects() {
        return this.projects;
    }

    public void addProject(Project p) {
        if (this.projects == null) {
            this.projects = new HashSet<Project>();
        }

        this.projects.add(p);
    }

}
