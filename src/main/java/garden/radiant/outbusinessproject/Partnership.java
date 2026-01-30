package garden.radiant.outbusinessproject;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Partnership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private Date creationDate;

    @NotNull
    @ManyToOne
    private Enterprise enterprise;

    @NotNull
    @ManyToOne
    private Project project;

    public Partnership() {
    }

    public Long getId() {
        return id;
    }

    /**
     * Récupère la date de création du partenariat.
     * @return la date de création
     */
    public Date getCreationDate() {
        return creationDate;
    }

    /**
     * Définit la date de création du partenariat.
     * @param creationDate la nouvelle date de création
     */
    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Récupère l'entreprise partenaire.
     * @return l'entreprise partenaire
     */
    public Enterprise getEnterprise() {
        return enterprise;
    }

    /**
     * Définit l'entreprise partenaire.
     * @param enterprise la nouvelle entreprise partenaire
     */
    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    /**
     * Récupère le projet concerné par le partenariat.
     * @return le projet
     */
    public Project getProject() {
        return project;
    }

    /**
     * Définit le projet concerné par le partenariat.
     * @param project le nouveau projet
     */
    public void setProject(Project project) {
        this.project = project;
    }
}
